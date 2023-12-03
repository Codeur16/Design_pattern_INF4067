# Adapter Pattern

The adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate.

In this example,we have a `Stack` and a `Double Linked List` and we know all the methods of the `Double Linked List` but we don't know the methods of the `Stack`. So we create an adapter class that implements the `Stack` interface and uses the `Double Linked List` methods to implement the `Stack` methods.


## Stack Interface

This is the stack interface.

```java
public interface Stack {
    void push(int value);
    Object pop();
    Object top();
    void print();
}
```

## Double Linked List Class

This is the double linked list class that we know all the methods of it.

```java
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
```

## Stack Adapter Class

This class implements the `Stack` interface and uses the `Double Linked List` methods to implement the `Stack` methods.

```java
public class DListImpStack extends DList implements Stack {
    @Override
    public void push(int value) {
        insertTail(value);
    }

    @Override
    public Object pop() {
        return removeTail();
    }

    @Override
    public Object top() {
        return getTail();
    }
}
```

## Main Class

This is the main class that we use the `Stack` interface.

```java
import com.adapter.DListImpStack;
import com.Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new DListImpStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print(); // 1 2 3 4
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Top: " + stack.top());
        stack.print();
    }
}
```