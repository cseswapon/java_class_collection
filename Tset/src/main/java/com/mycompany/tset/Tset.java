package com.mycompany.tset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tset {

    public static void main(String[] args) {
        Set <Integer> numbers = new TreeSet <>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Set using Treeset: " + ""+numbers);
        Iterator <Integer> iterate = numbers.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
