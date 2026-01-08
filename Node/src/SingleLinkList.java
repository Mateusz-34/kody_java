public class SingleLinkList {
    Node head;

    SingleLinkList(){
        head = null;
    }

    public void addFront(int data){
        Node newNode = new Node(data,head);
        head = newNode;
    }

    public void addBack(int data){
        Node newNode = new Node(data,null);
        Node temp = head;

        if (head == null){
            head = newNode;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void removeFrontEnd(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }

        Node nodePointer = head;

        while (nodePointer.next.next != null){
            nodePointer = nodePointer.next;
        }

        nodePointer.next = null;
    }

    public void removeFrontFront(){
        if (head == null){
            return;
        }
        head = head.next;
    }
}