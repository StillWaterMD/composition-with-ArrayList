package com.company;


interface human<T>{

    void print();
    String getname();
    T getage();

}



public class person <Num> implements human <Num>{


    private String name;
    private  Num age;

    public void print(){

        System.out.println("Person: "+this.name+ " Age: " + this.age);


    }

    public Num getage(){

        return this.age;
    }

    public String getname(){

        return this.name;
    }


    person(String name, Num age){

        this.name=name;
        this.age=age;
    }

    person(){

    }


}
