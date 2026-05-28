class Demo{
	public static void main(String[]args){
		int n=12345;
		int product=1;
		while(n!=0){
			int rem=n%10;
			product=product*rem;
			n=n/10;
		}
		System.out.println(product);
	}
}