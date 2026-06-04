class Demo{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("java");
		sb.insert(1,"s");
		System.out.println(sb);
		sb.insert(2,"ABC");
		System.out.println(sb);
	}
}