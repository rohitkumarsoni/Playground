#include<stdio.h>

int main()
{
  char a[100];
  int i=0;
  scanf("%[^\n]s", a );
  int count = 0;
  for (i=0; a[i] != '\0';i++)
  {
    if(a[i] ==' ' )
      count++;
  }
  printf("%d", count + 1);
      
  //Type your code here
  
}