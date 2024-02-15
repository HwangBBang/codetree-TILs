def firstFunc(n, arr):
    print(arr[n-1])


def secondFunc(n, arr):
    for idx, elem in enumerate(arr):
        if elem == n:
            print(idx+1)
            return
    print(0)


def thirdFunc(n, m, arr):
    print(*arr[n-1:m])


n, q = map(int, input().split())
elems = list(map(int, input().split()))

for _ in range(q):
    qs = list(map(int, input().split()))
    q = qs[0]
    a = qs[1]
    
    if q == 1:
        firstFunc(a, elems)
    elif q == 2:
        secondFunc(a, elems)
    else:
        b = qs[2]
        thirdFunc(a, b, elems)