package demo1;

public class sample2 {
	public static void main(String[] args) {
		
		String str="akshay";
		int length = str.length();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate string number   "+ch[j]);
				}
			}
		}
		
		
		
		
		
	}

}
