
n=int(raw_input())


def d_s(x):
    s=0
    while x>=10:
        s+=x %10
        x/=10
    return s+x

half=n/2
lucky=[]



	

c=0
req={key:0 for key in range(0,d_s((10**half)-1)+1)}
for i in range(1,10**half):
       req[d_s(i)]+=1
s=0
for k in req.keys():
	s+=req[k]**2
print s+1
