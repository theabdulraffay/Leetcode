class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            next = null;
        }
    }
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index > size - 1) return -1;
        Node temp = head;
        for(int i = 0; i < index;i++) {
            temp = temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        if(head == null) {
            head = n;
            tail = n;
        }
        else {
            n.next = head;
            head = n;
        }
        size++;
        
    }
    
    public void addAtTail(int val) {
        if(tail == null) {
            addAtHead(val);
        }
        else {
            Node n = new Node(val);
            tail.next = n;
            tail = n;
            size++;
        }
        
    }
    Node getNode(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index == 0){
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else {
            Node n = new Node(val);
            Node t = getNode(index - 1);
            n.next = t.next;
            t.next = n;
            size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        if(index == 0) {
            head = head.next;
            if(size == 1){
                tail = null;
            }
        } else {
            Node t = getNode(index - 1);
            t.next = t.next.next;
            if (index == size - 1) {
                tail = t;
            }
        }
        size--;
        
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
