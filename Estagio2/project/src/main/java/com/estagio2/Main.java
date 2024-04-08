package com.estagio2;

import main.java.com.estagio2.Stack;
import main.java.com.estagio2.SingleLinkedList;
import main.java.com.estagio2.StaticQueue;

public class Main {
    public static void main(String[] args) throws Exception {

        //instanciando as estruturas
        Stack<Integer> testePilha = new Stack<>(5);
        StaticQueue<Integer> testeFila = new StaticQueue<>(5);
        SingleLinkedList<Integer> testeLinkedList = new SingleLinkedList<>();

        //testando pilha
        testePilha.push(9);
        testePilha.push(12);
        testePilha.push(1997);
        testePilha.push(345); 
        System.out.println(testePilha.peek());
        System.out.println(testePilha.toString());
        System.out.println(testePilha.isFull());
        System.out.println(testePilha.pop());
        System.out.println(testePilha.toString());

        /* 
         * testeLinkedList.insert(9);
        testeLinkedList.insert(12);
        testeLinkedList.insert(1997);
        testeLinkedList.toArray();
        testeLinkedList.remove(12);
        System.out.println(testeLinkedList.search(34));
        System.out.println(testeLinkedList.search(9));
        testeLinkedList.isEmpty();
        */

    }
}