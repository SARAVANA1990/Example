package primenumber;

import java.util.*;

public class PrimeNumber {
	
	 public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       //Empty String
	      // String  primeNumbers = "";
	       List<Integer> l1=new ArrayList<Integer>(); 
	       
	       List<Integer> l2=new ArrayList<Integer>(); 

	       for (i = 1; i <= 1000; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		    // primeNumbers = primeNumbers + i + " ";
			  
			 
			  
			 // System.out.println(" "+1%1);
		   //  System.out.println(" "+i);
		    
		     l1.add(i);
		     
		  }	
	       }	
	       
	       for(i=1;i<=1000;i++){
	    	   int counter=0; 	
	    	   for(int j=1;j<=1000;j++){
	    		   if(i%j==0)
	  		     {
	  	 		counter = counter + 1;
	  		     }
	    		   
	    	   }
	    	   
	 		  if (counter ==2)
			  {
	 			 l2.add(i);
			  }
	    	   
	       }
	       
	       
	       
	       System.out.println(l1.size());
	       
	       
	       System.out.println(l2.size());
	       
	      
	      
	   }

}
