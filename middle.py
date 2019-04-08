s=input("enter string")
l=list(s)
r=len(l)
i=r//2
if(r%2==0):
    l[i]="*"
    l[i-1]="*"
else:
    l[i]="*"
s="".join(l)
print(s)