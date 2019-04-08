l=list()
n=int(input("enter n"))
for i in range(0,1000):
    exp=2**i
    l.append(exp)
for j in range(0,1000):
    if(l[j]<n<l[j+1]):
        print(l[j+1])

    elif(l[j]==n):
        print(l[j+1])
        
