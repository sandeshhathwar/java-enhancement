package com.sampleProgram.Operators;

public class Prime_Number {
	public static void main(String args[]){    
		  int i;
		  int m=0; 
		  int flag=0;      
		  int n=2;
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is neither prime nor composite number");      
		  }
		  else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
		}  

}
  