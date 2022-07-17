package demo1;

public class dupicatenumber {
	public static void main(String[] args) {
		
      String s1="akshay";
     int length = s1.length();
                char[] ch = s1.toCharArray();
		
                
                for(int i=0;i<length;i++) {
                	for(int j=i+1;j<length;j++) {
                		
                		if(ch[i]==ch[j]) {
                			System.out.println(ch[j]);
                		}
                		
                	}
                }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
