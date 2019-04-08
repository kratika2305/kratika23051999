s=input("enter string")
l=list(s)
r=len(l)
i=r//2
l[i]="*"

s="".join(l)
print(s)