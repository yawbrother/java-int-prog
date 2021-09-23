package com.gyesiama.algorithms;

import java.util.StringJoiner;

public class LinkedList<T> {
    Node head;

    private class Node {
        final T value;
        Node next;

        Node(T value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void add(T value) {
        Node node = new Node(value, null);
        if(head == null) {
            head = node;
        }
        else {
            Node last = head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }


    public void reverse() {
        if(head == null) {
            return;
        }

        Node n1 = head;
        Node n2;
        while(n1.next != null) {
            n2 = n1.next;
            n1.next = n2.next;
            n2.next = head;
            head = n2;
        }
    }
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("->", "[", "]");
        Node last = head;
        while(last != null) {
            joiner.add(last.value.toString());
            last = last.next;
        }
        return joiner.toString();
    }


}
