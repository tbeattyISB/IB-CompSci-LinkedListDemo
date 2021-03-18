public class LinkedList{
    Node head;

    public void add(Node node){
        if(head == null){
            head = node;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }


    //TODO: Create get(int index) method that returns that data at that point


    //TODO: Create insert(int index, int data) method that adds a new node at a given index

    //TODO: create delete(int index) method that removes a node from the list

    //TODO: Create a size() method that measure.

    public void printAll() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Node(8));
        list.add(new Node(2));
        list.add(new Node(4));
        list.printAll();
    }

}