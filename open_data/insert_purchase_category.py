import insert_from_file

def insert():
    table = 'purchase_category'
    columns = ['code', 'description']

    insert_from_file.insert(table, table, columns, columns)
