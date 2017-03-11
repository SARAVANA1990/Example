package interviewPrograms;

import java.util.*;
class LoopTest{
	public static void main(String...args){
		p1();
		p2();
		p3();
	}
static void p1(){
  for(int i=1;i<=5;i++){
	  for(int j=1;j<=i;j++){
			System.out.print("*");
	  }
	 System.out.println(""); 
  }	
	
}
static void p2(){
    for(int i=1;i<=5;i++){
		for(int j=5-i;j>=0;j--){
			System.out.print(" ");
		}
		for( int k=1;k<=i;k++){
			System.out.print("*");
		}
		System.out.println();
		
	}	

}
static void p3(){
    for(int i=1;i<=5;i++){
		for(int j=Math.round((5-i)/2);j>=0;j--){
			System.out.print(" ");
		}
		for( int k=1;k<=i;k++){
			System.out.print("*");
		}
		System.out.println();
		
	}	

}
}