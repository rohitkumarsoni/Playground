#include<stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  int first = n/100;
  int third = n%10;
  int sum = first  + third;
  printf("%d", sum);
  //Type your code here
  return 0;
}