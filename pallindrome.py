s=input("enter string")
l=list(s)
l1=list(s)
l1.reverse()
for i in range(0,len(l)):
    f=0
    if(l[i]==l1[i]):
       f=1
if(f==1):
    print("yes")
else:
    print("no")

