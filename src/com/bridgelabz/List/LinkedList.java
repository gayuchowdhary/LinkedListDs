package com.bridgelabz.List;

public class LinkedList implements linkedlist {
    Node head;

    @Override
    public void add(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insert(int pos,int data) {
        Node newNode = new Node(data);
        if(pos == head.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node requiredNode = head.next;
        Node previousNode = head;
        while(pos != requiredNode.data){
            previousNode = requiredNode;
            requiredNode = requiredNode.next;
        }
        newNode.next = requiredNode;
        previousNode.next = newNode;
    }
    public int pop(int data) {
        Node temp = head;
        head = temp.next;
        return (int) temp.data;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

