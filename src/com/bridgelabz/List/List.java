package com.bridgelabz.List;

public class List{
    public static void main(String[] args) {
        System.out.println(".....Welcome to linked list.....");
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(70);
        list.insert(70,30);
        list.popLast(70);

        System.out.println(list.toString());
    }


}

