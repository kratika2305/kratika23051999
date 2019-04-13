s=input("enter string")
l=list(s)
for i in range(len(l)):
    for j in range(i):
        if(l[i]<l[j]):
            temp=l[i]
            l[i]=l[j]
            l[j]=temp
s1="".join(l)
print(s1)