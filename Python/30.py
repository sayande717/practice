# lastName="null" = If no value is passed for lastName, the value "null" is used.
def greetUser(designation, firstName, lastName="null"):
    return f'Hi there, {str.title(designation)}. {str.title(firstName)} {str.title(lastName)}!'


def main():
    name = str(input('Enter full name in the format (Mr/Mrs First_name Last_name): ')).split(' ')
    # With keyword arguments, we don't have to think about the order in which we are passing the arguments.
    # Also, it makes the code more readable.
    print(greetUser(firstName=name[1], lastName=name[2], designation=name[0]))


main()
