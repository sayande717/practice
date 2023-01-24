# Check the 'try' block for errors.
try:
    print(f"Age: {int(input('Enter age: '))}, Income: {int(input('Enter income: '))}")
# If a ValueError is encountered, do this.
except ValueError:
    print('Invalid age / income entered.')