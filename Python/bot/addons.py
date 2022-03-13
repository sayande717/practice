#For calculation related functions
def calc(exp0,op,exp1):
    calcansvar = ['Answer = ',
                  'Remainder = ']
    if op == '+':
        return calcansvar[0] + str(exp0 + exp1)
    elif op == '-':
        return calcansvar[0] + str(exp0 - exp1)
    elif op == '*' or op == 'x' or op == 'X':
        return calcansvar[0] + str(exp0 * exp1)
    elif op == '/':
        if exp1 == 0:
            return 'Cannot divide a number by zero.'
        else:
            div = exp0 / exp1
            rem = exp0 % exp1
            if rem == 0:
                return calcansvar[0] + str(div)
            else:
                return calcansvar[0] + str(div) + '\n' + calcansvar[1] + str(rem)
    elif op == '%':
        rem = exp0 % exp1
        if rem == 0:
            return 'Error 404: Remainder not found! :face_with_monocle:'
        else:
            return calcansvar[1] + str(rem)
    elif op == '^':
        return str(pow(exp0,exp1))