#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char str1[50],str2[50];
  gets(str1); 
  gets(str2);
  if(strcmp(str1, str2)==0)
  {cout<<"It is correct ";
  }
  else
    cout<<"It is wrong";
  //Type your code here.
}