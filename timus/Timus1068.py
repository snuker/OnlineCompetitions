N=int(raw_input())



if N>0:
	print sum(range(N+1))
else:
	print sum(range(1,N-1,-1))
