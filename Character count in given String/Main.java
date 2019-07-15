#include<stdio.h>
int main()
{
  char string[50];
  int i,length,count=1;
  scanf("%s", string);
  for(length=0; string[length]!='\0';length++);
  if(length > 20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0;i<=length;i++)
    {
      if(string[i] == string[i+1])
      {
        count++;
      }
      else
      {
        printf("%c%d", string[i],count);
        count =1;
      }
    }
  }
    
  
}