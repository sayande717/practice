def gcd(m, n):
    if m < n:
        (m, n) = (n, m)
    if (m % n == 0):
        return n
    else:
        return (gcd(n, m % n))


print("GCD:", gcd(int(input('Enter m: ')), int(input('Enter n: '))))
