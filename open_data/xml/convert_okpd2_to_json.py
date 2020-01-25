import xmltodict
import json
import os

out = []
codes = {}
for i in os.listdir('xml/data/okpd2'):
    with open(f'xml/data/okpd2/{i}') as fd:
        data = xmltodict.parse(fd.read())
        data = data['ns2:nsiOkpd2']['ns2:body']
        for i in data['ns2:item']:
            try:
                temp = {}
                temp['name'] = i['ns2:nsiOkpd2Data']['ns2:name']
                temp['code'] = i['ns2:nsiOkpd2Data']['ns2:code']
                if temp['code'] in codes:
                    print(codes[temp['code']])
                    print(temp['code'], temp['name'])
                else:
                    codes[temp['code']] = temp['name']
            except Exception as e:
                print(e)
                print(i)

for i in codes:
    temp = {}
    temp['code'] = i
    temp['name'] = codes[i]
    out.append(temp)
with open('xml/data/okpd2.json', 'w') as f:
    json.dump(out, f, ensure_ascii=False)