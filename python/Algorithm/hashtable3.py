# Checking voting system with regards to who has voted or not

voted = {}

def check_voter(name):
    if voted.get(name):
        print("Kick them out")
    else:
        voted[name] = True
        print("Let them vote!")

# Testing

check_voter("tom")
check_voter("mike")
check_voter("mike")

print(voted)