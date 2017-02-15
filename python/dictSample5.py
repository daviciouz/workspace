import csv
import sys
import pprint

d = {}
with open('/home/stepsei/workspace/python/testinput2.csv') as f:
    reader = csv.DictReader(f)
    for row in reader:
        d.setdefault(row['TUID'], {}).update({row['SUBJ']: row['GRADE']})

# print(d)
print(d,'\n')          # end=" "

# print(d, ':', 'end=\n')   # end=" "

pprint.pprint(d)