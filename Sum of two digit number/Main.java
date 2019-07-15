#include<stdio.h>
int main()
{
  int num,sum=0;
  scanf("%d", &num);
  sum = sum + (num%10);
  sum = sum + (num/10);
  printf("%d", sum);
  
  //Type your code here
  return 0;
}