from sys import stdin



def get_primes(n):
    primes=list(range(n+1))
    primes[1]=0
    for x in primes:
     if x<=1:
      continue
     for j in range(x+x,len(primes),x):
      primes[j]=0 
    return filter(lambda x: x!=0,primes)

primes=get_primes(200000)

k=int(raw_input())
for line in stdin:
	n=int(line)
	print primes[n-1]
