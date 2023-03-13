# Tuples are immutable in nature.
# d.values() = Iterate over values in a dictionary.
# d.keys() = Iterate over keys in a dictionary.

ls = []
tup = ((1,3),(2,5))
d = {}
# Insert a tuple into a list
ls.append((1,3))
ls.append((2,3))
print(ls)

print(tup) # Entire tuple
print(tup[0]) # 1st tuple

d['a'] = 'a' # Key: 1, Value = 2
for character in "bcdefghi":
    d[character] = character
print(d)