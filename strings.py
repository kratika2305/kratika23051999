s=input("enter string")
l=list(s)
l1=list()
l2=list()
for i in range(len(l)):
    if(i%2==0):
        l1.append(l[i])
    else:
        l2.append(l[i])
s1="".join(l1)
s2="".join(l2)
print(s1," ",s2)