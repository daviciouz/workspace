# In implementing Dijkstra, we use three hash tables
# 1- Graph, 2-Costs (weights) and 3-Parents

graph = {}          #implementing the graph hash table

# graph: another hash table to represent the weights of edges
graph["start"] = {}
graph["start"]["a"] = 6
graph["start"]["b"] = 2

# graph["start] is a hash table and we can get the neighbors by using command below
# print(graph["start"].keys())

# If we want to find the weights of an edge
# print(graph["start"]["a"]

# Adding the rest of the nodes and their neighbors to the graph

graph["a"] = {}
graph["a"]["fin"] = 1

graph["b"] = {}
graph["b"]["a"] = 3
graph["b"]["fin"] = 5

graph["fin"] = {}       # This node doesn't have any neighbors

# Cost table
infinity = float("inf")
costs = {}
costs["a"] = 6
costs["b"] = 2
costs["fin"] = infinity


# Parents: Hash table
parents = {}
parents["a"] = "start"
parents["b"] = "start"
parents["fin"] = None

# An Array to keep track of all the nodes we have already processes: We don't need to process a node twice
processed = []
