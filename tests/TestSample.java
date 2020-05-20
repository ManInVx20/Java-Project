package tests;

public class TestSample {
	static String extractInt(String str) 
    { 
        // Replacing every non-digit number 
        // with a space(" ") 
        str = str.replaceAll("[^\\d]", " "); 
  
        // Remove extra spaces from the beginning 
        // and the ending of the string 
        str = str.trim(); 
  
        // Replace all the consecutive white 
        // spaces with a single space 
        str = str.replaceAll(" +", " "); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str; 
    } 

	public static void main(String[] args) {
		String str = new String(" 20,20,50,50 #000000 ");
		
		int x, y, w, h;
		str = extractInt(str);
		System.out.println(str);
		
		x = Integer.valueOf(str.substring(0, 2));
		System.out.println(x);
	}

}
