s=input("enter string")
n=len(s)
f=0
c=0
for i in s:
    if (i=='0' or i=='1'):
        f=1
    else:
        c=1
if (c==1):
    print('no')
else:
    print('yes')