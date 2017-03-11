package pattern;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*pattern1();
		pattern2();
		pattern3();
		pattern4();*/
		
		//pattern6();
		
		//pattern7();
		pattern8();
	}
	
    /*
     * ***** 
     * *****
     * *****
     * To Print square shape star            */
	
	static void pattern1(){
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
			System.out.print("*");	
			}
			System.out.println();
		}	
	}
	
/*	*
	**
	***
	****
	*****   */
	
	
	static void pattern2(){
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
static void pattern3(){
		
		for(int i=5;i>0;i--){
			for(int j=1;j<=i-1;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			for(int k=5;k >=i;k--){
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

static void pattern4(){
	for(int i=5;i>0;i--){
		for(int j=5;j>i;j--){
			//System.out.print("-");
			System.out.print(" ");
		}
		for(int k=0;k < i;k++){
		System.out.print("*");
		}
		System.out.println();
	}
	
}
	
	static void pattern6(){
		int t=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<t;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			t--;
			for(int k=1;k <= 2*i-1;k++){
			System.out.print("*");
		
			}
			System.out.println();
		}
}
	
	static void pattern7(){
		int t=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<t;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			t--;
			for(int k=1;k <= 2*i-1;k++){
			System.out.print("*");
		
			}
			System.out.println();
		}
		t=1; 
		for(int i=1;i<=5-1;i++){
			for(int j=1;j<=t;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			t++;
			
			for(int k=1;k<=(2*(5-i))-1;k++){
			  System.out.print("*");	
			}
			System.out.println();
		}	
}
	
	
	static void pattern8(){
		int t=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<t;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			t--;
			for(int k=1;k <= 2*i-1;k++){
				if(k==1||k==(2*i)-1){
			    System.out.print("*");
				}else{
					System.out.print("#");
				}
		
			}
			System.out.println();
		}
		t=1; 
		for(int i=1;i<=5-1;i++){
			for(int j=1;j<=t;j++){
				//System.out.print("-");
				System.out.print(" ");
			}
			t++;
			
			for(int k=1;k<=(2*(5-i))-1;k++){
				if(k==1||k==(2*(5-i))-1){
				    System.out.print("*");
			}else{
				System.out.print("#");
			}
			  
			}
			System.out.println();
		}	
}
	
}
