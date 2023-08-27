
def gcd(m,n):
    for divisor in range(min(m,n),1,-1):
        if m%divisor==0 and n%divisor==0:
            return divisor
    return 1

print("GCD:",gcd(14,63))