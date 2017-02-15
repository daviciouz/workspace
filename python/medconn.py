import pymysql


cnx = pymysql.connect(host='localhost', port=3306, user='med', password="uber123", database='meduber')
cursor = cnx.cursor()



query = "SELECT startlookup.startlocCode, endlookup.endlocCode, address.street FROM trip, startlookup, endlookup, address " \
        "WHERE startlookup.startlookupID = trip.startlookupID " \
        "AND trip.endlookupID = endlookup.endlookupID " \
        "AND address.addressID = startlookup.addressID " \
        "AND address.addressID = endlookup.addressID"
cursor.execute(query)


for x in cursor:
    print(x)