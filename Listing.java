package com.company;

import java.util.ArrayList;

public class Listing <Num> {

    private ArrayList<human> list;


    public  void addPerson(String name,Num age,int a) throws Exception{



            if ((a > list.size()) ||  (a < 0))
                throw new Exception ("Cannot add. Out of range");

            this.list.add(a,new person(name,age));

    }

    public  void addPerson(String name,Num age) {

        this.list.add(new person(name,age));

    }


    //prints all elements of list
    public void print(){

        for(int i = 0; i< list.size();++i){

            list.get(i).print();
        }
    }


    //returns 1st index of person with name

    public int getindex(String name) throws Exception{

        for (int i=0; i < this.list.size(); ++i){

            if(this.list.get(i).getname()==name) return i;

        }

        throw new Exception ("Dis was not found");



    }


    public void remove(int index) throws Exception {

        if (index > list.size() - 1) throw new Exception ("Out of range");

        list.remove(index);
    }

    public void remove(String name) throws Exception {


        for (int i = 0; i < list.size(); ++i) {

            if (list.get(i).getname() == name) {
                list.remove(i);
                System.out.println("Tis removed");
                return;

            }
        }

        throw new Exception("Name was not found");
    }


    Listing(){
        this.list=new ArrayList<human>();
    }



}
