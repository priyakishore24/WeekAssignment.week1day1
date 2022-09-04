package weekAssignment1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n =15;
		boolean isprime = true;
		
		for(int i=2 ; i < 15 ; i++ ) {
			
			if (n%i == 0)
			{
				System.out.println("Number is not a prime");
				isprime = false ;
				break;
			}
			
		}
		if (isprime == true ) {
			System.out.println("Number is a prime");
		}
		
	}

}
