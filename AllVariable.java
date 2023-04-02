class AllVariable {
	int a = 10; //instance variable
	static double b = 20.5; //static variable

	public static void main(String[] args) {
		boolean c = true; //local variable

		AllVariable obj = new AllVariable(); //object
		
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(c);
	}
}