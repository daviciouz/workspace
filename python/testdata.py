
import csv

# CSV file and store a reference to this open file as f
f = open('/home/stepsei/workspace/python/veronica.csv')

# csv.reader function parses the open file is assigned to csv_f
csv_f = csv.reader(f)

#  looping over the csv_f list.
for row in csv_f:
  print(row[1])

