.................
Main.java
.................
class Main{
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        System.out.println(sLL.head.next.next.value);
    }
}

..................................
Node.java
..................................
public class Node {
    public int value;
    public Node next;
    
}

.................................
SinglyLinkedList.java
.................................
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

    // Insert Method Singly Linked List 
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        } else if(location >=size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    
}


...........
//////finish///////////
