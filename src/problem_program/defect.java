package problem_program;

public class defect {
	public static void main(String[] args) {

    String ori="rar";
    String rev="";
    for(int i=ori.length()-1;i>=0;i--) {
    	rev=rev+ori.charAt(i);
    }
      
      System.out.println(rev);
      
     if(ori.equals(rev)) {
    	 System.out.println("palindrome");
     }
     else {
    	 System.out.println("not a palindrome");
     }
      
      
      
		
	}

}
