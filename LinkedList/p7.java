class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class CountOdd{
	public static void main(String[]args){
		Node head=new Node(10);
		Node second=new Node(25);
		Node third=new Node(30);
		Node fourth=new Node(45);
		head.next=second;
		second.next=third;
		third.next=fourth;
		int oddCount=0;
		Node temp=head;
		while(temp!=null){
			if(temp.data%2!=0){
				oddCount++;
			}
			temp=temp.next;
		}
		System.out.println(oddCount);
	}
}
