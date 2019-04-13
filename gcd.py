n=int(input("enter n"))
m=int(input("enter m"))
l=list()
for i in range(1,n+1):
    if(n%i==0):
        l.append(i)
l1=list()
for i in range(1,m+1):
    if(m%i==0):
        l1.append(i)
l2=list()
for i in range(len(l)):
    for j in range(len(l1)):
        if(l[i]==l1[j]):
            l2.append(l[i])
print(max(l2))