.................
Main.java
.................
class Main{
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        //System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 2);
        sLL.insertInLinkedList(10, 4);
        sLL.insertInLinkedList(8, 5);
        sLL.insertInLinkedList(11  , 3);
        //System.out.println(sLL.head.next.next.value);
        sLL.traversalSinglyLinkedList();
        sLL.deletionOfNode(3);
        sLL.traversalSinglyLinkedList();
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
    //Traversal in singly linked list

    public void traversalSinglyLinkedList(){
        if(head == null){
            System.out.println("SLL does not exists");
            
        }else{
            Node tempNode = head;
            for(int i = 0;i<size;i++){
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    //Search for a node 

    boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i =0; i<size;i++){
                if(tempNode.value == nodeValue){
                    System.out.print("Found the node at location " +i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found!");
        return false;
    }

    // Deleting the node from the linked list 

    public void deletionOfNode(int location){
        if(head == null){
            System.out.println("The SLL does not exist!");
            return;
        }else if(location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }

        }else if(location >= size){
            Node tempNode = head;
            for(int i = 0; i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

        }else {
            Node tempNode = head;
            for(int i = 0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}


...........
//////finish///////////
