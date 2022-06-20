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
    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

