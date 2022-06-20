package com.bridgelabz.List;


public class Node {
    int data;
    Node next;


    Node(int num){
        data = num;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}