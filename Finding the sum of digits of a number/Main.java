#include <stdio.h>
int main() 
{
  int num;
  int sum=0,rem;
  scanf("%d", &num);
  while(num!=0)
  {
    rem = num %10;
    sum = sum +rem;
    num= num/10;
  }
  printf("%d", sum);
	//Type your code
	return 0;
}