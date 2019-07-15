#include<stdio.h>
int main()
{
  int dia;
  float radius, area;
  scanf("%d", &dia);
  radius = (float)dia/2;
  area = 3.14 * radius * radius;
  printf("%0.2f", area);
  //Type your code here
  return 0;
}