package com.company;


import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Listing list=new Listing<Integer>();

        try{
            list.addPerson("Nafanya",27);
            list.addPerson("Bob",13);
            list.addPerson("Snail",18,0);
            list.addPerson("Shakespear",20, 2);
        }
        catch (Exception ex){

            System.out.println(ex.getMessage());

        }
        finally {

            list.print();

        }

        try{
            list.remove("Bob");

        }
        catch (Exception ex){

            System.out.println(ex.getMessage());

        }
        finally {

            list.print();

        }




    }





}
