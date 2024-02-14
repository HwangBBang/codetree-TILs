a, b, c = map(int, input().split())


def sol (a,b,c):
    if a < 11 and b < 11 and c < 11 : 
        return -1
    
    d = a - 11
    
    if b >= 11:
        h = b - 11
    else: 
        h = b + 13
        d -= 1
    
    if c >= 11: m = c - 11
    else: 
        m = c + 13
        h -= 1



    res =  (d * 24 * 60) + (h * 60 ) + m
    return res

print(sol(a,b,c))