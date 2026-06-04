class Demo{
	public static void main(String[]args){
		StringBuilder sb=new StringBuilder("hello");
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}