# BFS using Hash tables and queues
# In python we use the double-ended queue(deque) function

from collections import deque

def person_is_seller(name):
      return name[-1] == 'm'        # This function checks whether person's name ends with the letter m.
                                    # If yes we are assuming a mango seller.
graph = {}
graph["you"] = ["alice", "bob", "claire"]
graph["bob"] = ["anuj", "peggy"]
graph["alice"] = ["peggy"]
graph["claire"] = ["thom", "jonny"]
graph["anuj"] = []
graph["peggy"] = []
graph["thom"] = []
graph["jonny"] = []

def search(name):
    search_queue = deque()
    search_queue += graph[name]
    # This array is how you keep track of which people you've searched before.
    searched = []
    while search_queue:                      # While the queue isn't empty
        person = search_queue.popleft()      # grabs the first person off the queue
        # Only search this person if you haven't already searched them.
        if not person in searched:
            if person_is_seller(person):        # Checks whether the person is a mango seller
                print(person + " is a mango seller!") # Yes, they're a mango seller
                return True
            else:
                search_queue += graph[person]   # No, they aren't. Add all of this person's friends to the search queue
                # Marks this person as searched
                searched.append(person)
    return False                                # If you reached here, no one in the queue was a mango seller

search("you")




