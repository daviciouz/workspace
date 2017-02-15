import pymysql
import numpy as np
import requests
from requests.auth import HTTPDigestAuth
import json

time_range = 30         # range for picking up time, like pick up all from 10:30 to 11:00
time_range_count = 16   # how many time ranges we have in one day
waiting_time = 15       # how much time beforehand patient should arrive
time_limit = 30         # how much longer the picking up route can be than the shortest one
capacity = 4            # basic car capacity

def getDistance(origin, destination):
    url = "https://maps.googleapis.com/maps/api/distancematrix/json?"
    key = "AIzaSyDQsoQIu0YpgcyoC_N-X6MdWWmYM36bTts"

    url += "origins=" + origin
    url += "&destinations=" + destination
    url += "&key=" + key
    url = url.replace(" ", "+")
    myResponse = requests.get(url)
    jData = json.loads(myResponse.content)
    return jData['rows'][0]['elements'][0]['distance']['value']

cnx = pymysql.connect(host='localhost', port=3306, user='med', password="uber123", database='meduber')
cursor = cnx.cursor()

# query = "SELECT capacity, location FROM cars "
#
# cursor.execute(query)
#
# locations = []
# capacities = []
# cars = []
#
# for (capacity, location) in cursor:
#     locations.append(location)
#     capacities.append(capacity)
#
# for i in range(time_range_count):
#     cars.append(locations)

# query = "SELECT start, end, appt FROM trips"


query = "SELECT startlookup.startlocCode, endlookup.endlocCode, address.street FROM trip, startlookup, endlookup, address " \
        "WHERE startlookup.startlookupID = trip.startlookupID " \
        "AND trip.endlookupID = endlookup.endlookupID " \
        "AND address.addressID = startlookup.addressID " \
        "AND address.addressID = endlookup.addressID"
cursor.execute(query)


for x in cursor:
    print(x)