#include<stdio.h>
int main()
{
  float radius, angle;
  scanf("%f", &radius);
  scanf("%f", &angle);
  float arc = 2 * 3.14 * radius * (angle / 360 );
  printf("%0.2f", arc);
  
}