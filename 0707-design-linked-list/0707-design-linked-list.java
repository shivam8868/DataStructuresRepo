class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int v) {
            val = v;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        Node current = head;
        int i = 0;
        // if(index < 0 ) return -1;
        while (current != null) {
            if (index == i) {
                return current.val;
            }
            current = current.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        // if(head==null) head=newNode;
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {

        Node current = head;
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        // newNode.next=null;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        //  if(index<0) {
        //     return;
        //  }
        // if(index==0) {
        //         addAtHead(val);
        //         return;
        //     }
        //  else {
        //     Node prev=head;
        //     Node current = head.next;
        //     int i=1;
        //     while(current!=null) {
        //        if(i==index) {
        //         Node newNode=new Node(val);
        //         prev.next=newNode;
        //         newNode.next=current;
        //         return;
        //        }
        //        i++;
        //         prev=current;
        //         current=current.next;
        //     }
        //     if(i==index) {
        //         Node newNode = new Node(val);
        //         prev.next=newNode;
        //     }
        //  }

        if (index < 0)
            return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null)
            return; // index out of bounds
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtIndex(int index) {
        // if(index<0 || head==null) {
        //     return;
        // }
        // else {
        //     Node current = head.next;
        //     Node prev = head;
        //     int i=1;
        //     while(current!=null) {
        //         if(index==i) {
        //             prev.next=current.next;
        //         }
        //         prev=current;
        //         current=current.next;
        //         i++;
        //     }
        // }
        if (index < 0 || head == null)
            return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null || current.next == null)
            return; // index out of bounds
        current.next = current.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */