// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int gcd();
int main()
{
  int n1,n2,a,b;
  scanf("%d", &n1);
  scanf("%d", &n2);
  
  if(n1>n2)
  {
     a=n1;
     b= n2;
    gcd(a,b);
  }
  else
  {
     a=n2;
     b= n1;
    gcd(a,b);
  }
  
    
   return 0;
}

    int gcd(int a, int b)
    {
       while(a>b)
        {
          int c = a%b;
            if(c==0)
              {
                  printf("%d",b);
                  break;
              }
               a=b;
               b=c;
         }
    }