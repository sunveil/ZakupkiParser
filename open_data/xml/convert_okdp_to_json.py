import xmltodict
import json
import os

out = []
codes = {}
for i in os.listdir('xml/data/okdp'):
    with open(f'xml/data/okdp/{i}') as fd:
        data = xmltodict.parse(fd.read())
        data = data['ns2:nsiOkdp']['ns2:body']
        for i in data['ns2:item']:
            try:
                temp = {}
                temp['name'] = i['ns2:nsiOkdpData']['ns2:name']
                temp['code'] = i['ns2:nsiOkdpData']['ns2:code']
                if temp['code'] not in codes:
                    codes[temp['code']] = temp['name']
                else:
                    print(codes[temp['code']])
                    print(temp['code'], temp['name'])
                out.append(temp)
            except Exception as e:
                print(e)
                print(i)
    with open('xml/data/okdp.json', 'w') as f:
        json.dump(out, f, ensure_ascii=False)