import csv

f = open('/home/stepsei/workspace/python/attendees1.csv')
csv_f = csv.reader(f)

attendee_emails = []

for row in csv_f:
  attendee_emails.append(row[1])

print(attendee_emails)
