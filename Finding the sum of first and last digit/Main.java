#include <stdio.h>
int main() 
{
  int n, sum = 0;
  scanf("%d", &n);
  sum = sum +(n%10);
  while(n>=10)
  {
    n= n/10;
  }
  sum = sum + n;
  printf("%d", sum);
  
  
	//Type your code
	return 0;
}