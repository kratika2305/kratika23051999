s=input("enter string")
l=list(s)
for i in l:
    f=0
    if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u" or i == "A" or i == "E" or i == "I" or i == "O" or i == "U"):

        f=1
if (f==1):
     print("yes")
else:
    print("no")