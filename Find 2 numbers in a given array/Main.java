#include<stdio.h>
int main()
{
  int num,i=0;
  scanf("%d", &num);
  int array[num-1];
  for (i = 0; i<num;i++)
  {
    scanf("%d", &array[i]);
  }
  int ele1,ele2;
  scanf("%d %d", &ele1, &ele2);
  for (i = 0; i<num;i++)
  {
    if(array[i] == ele1)
    {
      printf("Element 1 index = %d\n", i);
      break;
    }
  }
  if (i>=num)
    {
      printf("Element 1 index = -1\n");
    }
    
  for (i = 0; i<num;i++)
  {
    if(array[i] == ele2)
    {
      printf("Element 2 index = %d\n", i);
      break;
    }
  }
    if (i>=num)
    {
      printf("Element 2 index = -1");
    }
    
  	//type your code here
}