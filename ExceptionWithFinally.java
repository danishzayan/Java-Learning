class ExceptionWithFinally {
	public static void main(String[] args) {
		int balance = 100;
		int withdraw = 500;

		try
		{
			if(balance < withdraw) {
				throw new ArithmeticException("No money...");
			}
		}	
		catch(ArithmeticException e) 
		{
			System.out.println("Your can't withdraw money bcz you have insufficiant balance: " +e);
		}
		finally 
		{
			System.out.println("Thankyou using for ATM serivces..");
		}
	}
}