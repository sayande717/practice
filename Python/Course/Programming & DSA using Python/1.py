# Implement Greatest Common Divisor (GCD)
# gcd(m,n) = result
def gcd(m,n):
    mFactors = []
    # List the factors of m
    for i in range(1,m+1):
        if m%i == 0:
            mFactors.append(i)
    print(mFactors)
    nFactors = []
    # List the factors of n
    for i in range(1, n+1):
        if n % i == 0:
            nFactors.append(i)
    print(nFactors)
    # Find the common ones between both lists
    commonFactors = []
    for factor in mFactors:
        if factor in nFactors:
            commonFactors.append(factor)

    # Since the list is sorted in ascending order, return the rightmost element.
    return commonFactors[-1]

print("GCD:",gcd(14,63))