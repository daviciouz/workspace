import csv

file = open('journals1.csv', 'w+')

exampleFile = open('/home/stepsei/workspace/python/veronica.csv')
exampleReader = csv.reader(exampleFile)

for row in exampleReader:
        print('Row #' + str(exampleReader.line_num) + ' ' + str(row))

file.write('Row #' + str(exampleReader.line_num) + ' ' + str(row))

file.close()
