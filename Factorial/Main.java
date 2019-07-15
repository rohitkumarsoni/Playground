#include<stdio.h>
int main()
{
  long int num,fact = 1;
  scanf("%ld", &num);
  
  for(int i = 1;i<=num; i++)
  {
    fact = fact *i;
  }
  printf("%ld", fact);
  
	//your code here
}