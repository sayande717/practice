def main():
    income = int(input('Enter income: '))
    creditID = int(input("Enter 1 if applicant has good credit, otherwise 0: "))
    if creditID == 1:
        credit = True
    elif creditID == 0:
        credit = False
    else:
        print('Enter proper credit.')
        return
    print(loanEligibility(income,credit))

def loanEligibility(income,credit):
    if income >50000 & credit :
        return 'Eligible for loan'
    else:
        return 'Not eligible for loan'

main()