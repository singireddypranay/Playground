#include<iostream>
using namespace std;
int main()
{
  int s,e,i,sum,n;
  cin>> s >>e;
  for(i=s;i<=e;i++)
  {
    n=1;
    sum=0;
    while(n<i)
    {
      if(i%n==0)
      {
        sum=sum+n;
      }
        n++;
      
    }
    if(sum==i)
      cout<<i <<" ";
  }
}