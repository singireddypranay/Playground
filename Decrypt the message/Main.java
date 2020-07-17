#include<iostream>
using namespace std;
int main()
{
  int n,t,i,sum=0,num,div;
  cin>>n >>t;
   num=n+t;
   for(i=1;i<num;i++)
   {
     div=num%i;
       if(div==0)
     {
  sum=sum+i;
   }
   }
     if(sum==num)
     {
       cout<<"They can read the message";
     }
  else
    cout<<"They can't read the message";
}