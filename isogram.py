s=input("enter string")
l=list(s)
x=list()
for i in range(len(l)):
    c=0
    for j in range(0,len(l)):
        if(l[i]==l[j]):
            c=c+1
    x.append(c)
for i in range(len(x)):
    f=0
    if(x[i]==1):
        f=1
if(f==1):
    print("yes")
else:
    print("no")