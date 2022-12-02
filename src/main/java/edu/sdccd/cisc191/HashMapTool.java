package edu.sdccd.cisc191;

import java.util.*;

import static java.lang.System.*;

//Week 9 hashMap
public class HashMapTool {

    public static void main(String[] args) {

        out.println("\n");
        //Using HashMapTool to modify the name and password
        HashMap<String, String> customerPasswordList = new HashMap<String, String>();
        customerPasswordList.put("Yh Shi", "PassWord$$");
        customerPasswordList.put("Bat Tom", "WhatToSet??##");
        customerPasswordList.put("Cat Bob", "ItIs@String");

        out.println("\n" + customerPasswordList);

        //type the name and new password
        out.println(customerPasswordList.replace("Yh Shi", "PassWordCh@nged$$"));
        out.println("\n" + customerPasswordList);

        out.println("\n");



        //week 10 linked list
        // create a linked list
        // Step1: Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        // Step2: Add elements to LinkedList
        linkedList.add("#Null#");
        linkedList.add("yh Shi");
        linkedList.add("Tom Bat");
        linkedList.add("Bob Cat");
        linkedList.add("Daren");
        linkedList.add("DC");
        linkedList.add("Rock");

        System.out.print(linkedList);

        System.out.println("Type the name you need to search:");
        Scanner scanner = new Scanner(System.in);
        String nameIn = scanner.nextLine();

        //Searching first occurrence of element
        int insertTo = linkedList.indexOf(nameIn);

        System.out.println( "\n"+ nameIn+ "'s ID number is 000" + insertTo);

        System.out.println("Insert a new name in front of: "+ nameIn);
        String addName = scanner.nextLine();
        linkedList.add(insertTo,addName);
        System.out.print(linkedList);

        int newID = insertTo+1;
        System.out.println( "\n"+ addName+ "'s ID number is 000" + insertTo);
        System.out.println( "\n"+ nameIn+ "'s ID number is 000" + newID);


        //genericAccount
        genericValue<Integer> account = new genericValue<>(100000);
        account.print();

        genericValue<Double> doubleValue = new genericValue<>(10.11);
        doubleValue.print();

        genericValue<String> stringValue = new genericValue<>("Investor Level:999");
        stringValue.print();
    }
}


