# When you visit a website, it first checks whether the page is stored in the hash

cache = {}      # create the hash to keep track

def get_page(url):
    if cache.get(url):
        print("Data retrieved from cache") # returns cached data
    else:
        cache[url] = True
        data = cache[url]    # saves this data in your cache first
        print("Data is not from cache")
# Testing

get_page("www.google.com")
get_page("www.facebook.com")
get_page("www.temple.edu")
get_page("www.amazon.com")
get_page("www.amazon.com")

print(cache)