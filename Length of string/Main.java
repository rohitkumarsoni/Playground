#include<stdio.h>
#include<string.h>
int main()
{
  char string[100];
  int i=0,count = 0;
  gets(string);
  for (i=0;i<strlen(string);i++)
  {
    if(string[i] != '\0')
    {
      count++;
    }
  }
  printf("%d", count);
  //Type your code here
  return 0;
}