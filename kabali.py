n=int(input("enter no of testcases"))
for i in range(n):
    x,y=map(int,input("enter two numbers").split(","))
    if(x<=y):
        print(abs(x-y))