# https://newcircle.com/s/post/1572/python_for_beginners_reading_and_manipulating_csv_files

# Check this out as well
# http://stackoverflow.com/questions/37628184/reformat-csv-file-using-python

import csv

# CSV file and store a reference to this open file as f
f = open('/home/stepsei/workspace/python/attendees1.csv')

# csv.reader function parses the open file is assigned to csv_f
csv_f = csv.reader(f)

for row in csv_f:
  print(row)


import csv

f = open('/home/stepsei/workspace/python/attendees1.csv')
csv_f = csv.reader(f)

attendee_emails = []

for row in csv_f:
  attendee_emails.append(row[2])

print(attendee_emails)



import csv

f = open('attendees1.csv')
csv_f = csv.reader(f)

attendee_emails1 = []

for row in csv_f:
  attendee_emails1.append(row[2])


f = open('attendees2.csv')
csv_f = csv.reader(f)

attendee_emails2 = []

for row in csv_f:
  attendee_emails2.append(row[2])

print attendee_emails1
print attendee_emails2
