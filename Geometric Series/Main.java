#include<stdio.h>
int main()
{
  int n,a,r,s1,s2,term;
  scanf("%d", &n);
  if(n%2==1)  //odd
  {
    a=1,r=2;
    s1=(n+1)/2;
    term = a* pow(r, s1-1);
    printf("%d", term);
  }
  else
  {
    a=1,r=3;
    s2=n/2;
    term = a* pow(r, s2-1);
    printf("%d", term);
  }
    
  return 0;
}