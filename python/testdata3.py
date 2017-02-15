import csv
outputFile = open('/home/stepsei/workspace/python/output1.csv', 'w', newline='')
outputWriter = csv.writer(outputFile)
outputWriter.writerow(['FID','NUM','NORTHING','EASTING','ELEV','DESC','LONG','LAT','SOURCE','SET_BY','DATE','NOTES','PROJECT'])

outputWriter.writerow([0,7,278466.212,2684150.851,317.292,'SPIKESET',-75.1926,40.069303,'TS','JC','4/6/2016','CITY_DATUM','SKELLY-2012-001D'])


outputFile.close()
