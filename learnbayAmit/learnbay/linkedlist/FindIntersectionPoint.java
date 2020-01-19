package linkedlist;

public class FindIntersectionPoint {

	public static void main(String[] args) {
		
        LinkedListReturnsNode list1 = new LinkedListReturnsNode();
		
		          list1.insertAtStart(10);
		Node t2 = list1.insertAtLast(20);
		Node t3 = list1.insertAtLast(30);
		Node t4 = list1.insertAtLast(40);
		Node t5 = list1.insertAtLast(50);
		
		LinkedListReturnsNode list2 = new LinkedListReturnsNode();
		
        list2.insertAtStart(100);
        list2.insertAtLast(90);
        list2.insertAtLast(70);
        Node node = list2.insertAtLast(80);
        
        node.next=t4;
        list1.printlistWithSameLine();
        System.out.println();
        list2.printlistWithSameLine();
        
        int len1 = 0;
        int len2 = 0;
        
        Node current1 = list1.head;
        while(null!=current1) {
        	len1++;
        	current1 = current1.next;
        }
        
        Node current2 = list2.head;
        while(null!=current2) {
        	len2++;
        	current2 = current2.next;
        }
        System.out.println();
        System.out.println("Length1-->"+len1+" "+"Length2-->"+len2);
        
        Node head1;
        Node head2;
        
        int diff = 0;
        
        if(len1<len2) {
        	head1 = list1.head;
        	head2 = list2.head;
        	diff = len2-len1;
        }else {
        	head1 = list1.head;
        	head2 = list2.head;
        	diff = len1-len2;
        }
        
        for(int i=0;i<diff;i++) {
        	head1 = head1.next;
        	while(null!=head1 && null!=head2) {
        		if(head1==head2) {
        			System.out.println(head1.data);
        			break;
        		}
        		head1 = head1.next;
        		head2 = head2.next;
        	}
        }
	}

}
