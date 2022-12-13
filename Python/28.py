dictionary = {
    # key: value
    'Name':'John',
    'Age': 30,
    'is_verified': True
}

# Print the entire dictionary
print(dictionary)
# Print the value of the key 'Name'
print(dictionary['Name'])
# Get the value of 'dateOfBirth', and if not found, print 'Jan 1 1980'.
print(dictionary.get('dateOfBirth', 'Jan 1 1980'))
