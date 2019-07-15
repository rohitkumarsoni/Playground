#include<stdio.h>
int main()
{
  int num,search,i = 0;
  scanf("%d", &num);
  int array[num-1];
  for(i=0;i<num;i++)
  {
    scanf("%d", &array[i]);
  }
  scanf("%d", &search);
 for(i=0;i<num;i++)
 {
   if (array[i] == search)
   {
    printf("%d", i+1);
     break;
   }
 }
 
  if(i>=num)
  {
    printf("%d isn't present in the array.", search);
   
  }
 
  return 0;
}