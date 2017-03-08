package recursionexample;

class Factorial {

    int fact(int n) {

         int result;

    if ( n ==1) return 1;

    System.out.println("n.............  " + n);
    
    System.out.println("n.............  " + (n-1) * n);
    
    result = fact (n-1) * n;
    
    System.out.println("result.............  " + result);

    return result;

    }

}


//class Prnt {
//
//    void p(){
//    	System.out.println("b4");
//    	p();
//    	System.out.println("af");
//    }
//
//}



class Recursion {

    public static void main (String args[]) {

         Factorial f =new Factorial();
         
        // Prnt p =new Prnt();
         //p.p();
         
       f.fact(5);
         

//         System.out.println("Factorial of 3 is  " + f.fact(3));
//
//         System.out.println("Factorial of 3 is  " + f.fact(4));
//
//         System.out.println("Factorial of 3 is  " + f.fact(5));

    }

}