class Demo{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("java");
		sb.replace(0,4,"python");
		System.out.println(sb);
		sb.replace(1,3,"DSA");
		System.out.println(sb);
	}
}