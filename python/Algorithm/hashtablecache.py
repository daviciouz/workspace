# When you visit a page on facebook, it first checks whether the page is stored in the hash

cache = {}      # create the hash to keep track

def get_page(url):
    if cache.get(url):
        return cache[url]   # returns cached data
    else:
        data = get_data_from_server(url)
        cache[url] = data   # saves this data in your cache first
        return data
