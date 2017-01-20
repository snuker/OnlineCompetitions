n=int(raw_input())

digits={key:0 for key in range(2,10)}
if n==0:
	print 10
	exit(0)
if n <9:
	print n
	exit(0)

for i in [9,8,7,6,5,4,3,2]:
	while n % i==0:
		n/=i
		digits[i]+=1
if n==1:
	res=""
	for x in range(2,10):
		res+=(str(x)*digits[x])
	print res
else:
	print -1


