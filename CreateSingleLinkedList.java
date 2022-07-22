..........
Main.java
.........

class Main{
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(6);
        System.out.println(sLL.head.value);
    }
}

.............
Node.java
.............
public class Node {
    public int value;
    public Node next;
    
}

........................
SinglyLinkedList.java
........................
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
}
////////Finish////////////////
