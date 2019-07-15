#include<stdio.h>
int main()
{
  int range,sum;
  scanf("%d", &range);
  int a=0,b=1;
  printf("%d %d ", a, b);
  for (int i = 3; i<= range; i++)
  {
    sum = a + b;
    printf("%d ", sum);
    a = b;
    b = sum;
  }
 
    
  
  //Type your code here
  return 0;
}