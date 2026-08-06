class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class SumLL{
	public static void main(String[]args){	
		Node head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		head.next=second;
		second.next=third;
		third.next=fourth;
		int sum=0;
		Node temp=head;
		while(temp!=null){
			sum=sum+temp.data;
			temp=temp.next;
		}
		System.out.println(sum);
	}
}
