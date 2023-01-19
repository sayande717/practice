def gcd(m, n):
    if m < n:
        # swap m and n, so that m>n
        (m, n) = (n, m)
    if m % n == 0:
        return n
    else:
        diff = m-n
        # gcd(n,m-n), n is larger than m-n
        return (gcd(max(n, diff), min(n, diff)))
