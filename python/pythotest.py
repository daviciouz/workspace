#!/usr/bin/env python
from __future__ import print_function

import pymysql

conn = pymysql.connect(host='localhost', port=3306, user='med', passwd='uber123', db='meduber')

cur = conn.cursor()

cur.execute("SELECT * FROM trip")

print(cur.description)

print()

for row in cur:
    print(row)

cur.close()
conn.close()