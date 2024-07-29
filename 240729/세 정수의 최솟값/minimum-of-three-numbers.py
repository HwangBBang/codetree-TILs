a, b, c = input().split(" ")
a = int(a)
b = int(b)
b = int(b)

if a <= b and a <= c:
    res = a

elif b <= a and b <= c:
    res = b

else:
    res = c

print(res)