package com.mycompany.hset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author swapon
 */
public class Hset {

    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1"+ " " +  set1);
        
        Set <Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Set1"+  " " +  set1);
        
        set2.addAll(set1);
        
        System.out.println("Union" + " " + set2);
    }
}
