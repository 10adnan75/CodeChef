def prepare(n, d):
    a = []
    m = str(n)
    int_part = ''
    dec_part = ''
    if '.' in m:
        int_part, dec_part = m.split('.')
    else:
        int_part = m
    if len(int_part) % 2 != 0:
        int_part = '0' + int_part
    for i in range(0, len(int_part), 2):
        a.append(int(int_part[i:i+2]))
    if len(dec_part) % 2 != 0:
        dec_part += '0'
    for i in range(0, len(dec_part), 2):
        a.append(int(dec_part[i:i+2]))
    min_dec = len(dec_part) // 2
    d = max (d, min_dec)
    for i in range(min_dec, d):
        a.append(0)
    return (a, d)

def sqrtLongDiv(n, d):
    a, d = prepare(n, d) 
    b = ''               
    drange = range(10)[::-1]
    divisor = 0
    dividend = 0
    remainder = 0
    quotient = 0
    unit = 0
    dec_point = len(a)-d 
    for i in range(len(a)):
        if i == dec_point: 
            b += '.'
        dividend = dividend * 100 + a[i] 
        for dig in drange:  
            if (divisor * 10 + dig) * dig <= dividend:
                b += str(dig)
                remainder = dividend - ((divisor * 10 + dig) * dig)
                unit = dig
                break
 
        quotient = quotient * 10 + unit
        divisor = quotient * 2
        dividend = remainder
    return b
    
for _ in range(int(input())):
    n = int(input())
    d = int(input())
    print(sqrtLongDiv(n,d))
