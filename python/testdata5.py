
import csv

exampleFile = open('/home/stepsei/workspace/python/veronica.csv')
exampleReader = csv.reader(exampleFile)

#data = [row for row in data]
new_data=[[row[0],row[1]+row[2]] for row in data]
data=[[row[0], eval(row[1]), eval(row[2])] for row in data]
out.close()

print(data)

out=open('/home/stepsei/workspace/python/new_data.csv','wb')
output = csv.writer(out)

for row in new_data:
    output.writerow(row)

print(new_data)

out.close()
