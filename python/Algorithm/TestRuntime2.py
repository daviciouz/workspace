def get_list():
    global destination_list
    destination_list = []
    destination_list.extend(('1','2','3'))
    return destination_list

get_list()
print(destination_list)
