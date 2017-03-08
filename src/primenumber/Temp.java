package primenumber;


public class Temp {
	public static void main(String args[]) {
		
		String text = "123456-\"NATASHA\" SAKHIMANDLEMESWAN TEST"; 
		
		text = text.replaceAll("[^a-zA-Z0-9,^-]", " "); 
		System.out.println(text.trim()); 

	 
		} 




  		// text = text.replaceAll("[^a-zA-Z0-9]", "");

}
