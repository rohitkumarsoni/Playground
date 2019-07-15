#include<stdio.h>
int main()
{
  int binary;
  scanf("%d", &binary);
  int base = 1, decimal = 0;
  while(binary > 0)
  {
    int last = binary % 10;
    decimal = decimal + (last * base);
    binary = binary / 10;
    base = base * 2;
  }
  printf("%d", decimal);
    
    
  //Type your code here
  return 0;
}