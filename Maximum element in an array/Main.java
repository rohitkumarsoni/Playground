#include<stdio.h>
int main()
{
  int num, i = 0, count = 0;
  scanf("%d", &num);
  int array[num-1];
  for (i=0;i<num;i++)
  {
    scanf("%d", &array[i]);
  }
  int max = array[0];
  for (i=0;i<num;i++)
  { 
    if(array[i] >max)
    {
      max = array[i];
      count = count + 1;
    }
  }
  printf("%d", max);
  	//type your code here
}