package demo1;



public class sample1 {
	
	public static void main(String[] args) {
		
		
		int n=7;
		int count=0;
		
		for(int i=1;i<=7;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("is prime number");
			}
			else {
				System.out.println("is not a prime number");
			}
		
	}

}
