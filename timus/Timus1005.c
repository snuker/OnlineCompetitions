#include<stdio.h>


int arr[20];
int main(){
	int i;
	int n;
	scanf("%d",&n);
	for (i=0;i<n;i++)
		scanf("%d",arr+i);
	int mx=(1<<n)-1;
	int res=1e9;
	while (mx){
		int x=0;
		for (i=0;i<n;i++)
			x+= ((mx>>i)&1)? arr[i] : -arr[i];
		if (abs(x)<res)
			res=abs(x);
	mx--;	
	}
	printf("%d\n",res);
	return 0;
}
