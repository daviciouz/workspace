import pandas as pd
from pandas import DataFrame

import datetime
import pandas.io.data

#sp500 = pd.io.data.get_data_yahoo('%5EGSPC', start = datetime.datetime(2000, 10, 1), end=datetime.datetime(2016,6,11))

#print(sp500)

#print just the structure
#print(sp500).head()

#Save to CSV

#sp500.to_csv('/home/stepsei/workspace/python/sp500_type.csv')
#Read from our CSV file
#df = pd.read_csv('/home/stepsei/workspace/python/sp500_type.csv')



# To format the output from the read we use below
#df = pd.read_csv('/home/stepsei/workspace/python/veronica.csv', index_col = 'Date', parse_dates = True)

df = pd.read_csv('/home/stepsei/workspace/python/veronica.csv')

print df.head()

