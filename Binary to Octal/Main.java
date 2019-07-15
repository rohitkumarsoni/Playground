#include<stdio.h>

int main()
{
  int num,decimal=0,base=1;
  scanf("%d", &num);
  while(num>0)
  {
    int last = num%10;
    decimal = decimal + last * base;
    num = num/10;
    base = base*2;
  }
  int arr[20],i=0;
  while(decimal>0)
  {
    arr[i] = decimal%8;
    decimal = decimal/8;
    i++;
  }
  for(int j=i;j>=0;j--)
  {
    printf("%d",arr[j]);
  }
 
}