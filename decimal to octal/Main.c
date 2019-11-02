#include<stdio.h>
int main()
{
  int decimal,i=0;
  scanf("%d", &decimal);
  int octal[100];
  while(decimal > 0)
  {
    octal[i] = decimal % 8;
    decimal = decimal / 8;
    i++;
  }
  for(int j = i-1; j>=0; j--)
  {
    printf("%d", octal[j]);
  }
  
    
  
  //type your code here
  return 0;
}
