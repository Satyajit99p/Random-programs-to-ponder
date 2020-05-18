
print('enter the values ')
x=[]
for i in range(0,10):
    y=int(input())
    x.append(y)

p=0
while(p<9):
    min=p
    for j in range((p+1),10):
        if(x[j] < x[min]):
            min=j
    temp=x[min]
    x[min]=x[p]
    x[p]=temp
    p=p+1

for k in range (10):
    print(x[k])