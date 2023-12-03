package com.DList;

public class DList {
    private Node head;
    public void insert(Node pos,Object o){
        Node node = new Node();
        node.data = o;
        node.next = pos.next;
        pos.next = node;
    }

    public void remove(Node pos){
        pos.next = pos.next.next;
    }

    public void insertHead(Object o){
        Node node = new Node();
        node.data = o;
        node.next = head;
        head = node;
    }

    public void insertTail(Object o){
        Node node = new Node();
        node.data = o;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = node;
        }
    }

    public Object removeHead(){
        Node node = head;
        head = head.next;
        return node.data;
    }

    public Object removeTail(){
        Node p = head;
        Node q = null;
        while(p.next != null){
            q = p;
            p = p.next;
        }
        if(q == null){
            head = null;
        }else{
            q.next = null;
        }
        return p.data;
    }

    public Object getHead(){
        return head.data;
    }

    public Object getTail(){
        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        return p.data;
    }

    public void print(){
        Node p = head;
        while(p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public Node getHeadNode(){
        return head;
    }


}
