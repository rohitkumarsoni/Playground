#include <stdio.h>
int main()
{
  int base,expo,root=1;
  scanf("%d%d", &base, &expo);
  if(expo < 0)
  {
    printf("Wrong input");
  }
  else
  {
    for(int i = 1; i<=expo; i++)
    {
    root = root * base; 
    }
    printf("%d", root);
  }
  
  
  	//Your code here       
    return 0;
}