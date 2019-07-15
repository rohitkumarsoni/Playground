#include <stdio.h>
int main() 
{
  int n,rem;
  scanf("%d", &n);
  while(n>=100)
  {
     n=n/10;
  }
  rem = n%10;
  printf("%d", rem);
  
	//Type your code
	return 0;
}