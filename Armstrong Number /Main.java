#include <stdio.h>
int main() 
{
  int n;
  scanf("%d", &n);
  int sum=0;
  int temp = n;
  while(n>0)
  {
    int digit = n%10;
    sum = sum + (digit*digit*digit);
    n=n/10;
  }
  if(temp == sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  
    
  
    
	//Type your code
	return 0;
}