#include<stdio.h>
int main()
{
  int n,i=0;
  int binary[32];
  scanf("%d", &n);
  while(n>0)
  {
    binary[i] = n % 2;
    n=n/2;
    i++;
  }
  for (int j = i-1; j>=0;j--)
  {
   printf("%d", binary[j]);
  }
          
  //Type your code here
  return 0;
}