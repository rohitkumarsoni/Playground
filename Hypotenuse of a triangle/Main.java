#include<stdio.h>
#include<math.h>
int main()
{
  float side1, side2;
  scanf("%f%f", &side1, &side2);
  float temp = (side1 * side1) + (side2 * side2);
  float hypo = sqrt(temp);
  printf("%0.2f", hypo);
  
  
  //Type your code here
  return 0;
}