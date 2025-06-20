package com.mycompany.llist;
import java.util.LinkedList;
import java.util.List;

public class LList {

    public static void main(String[] args) {
       List <Integer> linkNumber = new LinkedList<>(); 
       linkNumber.add(1);
       linkNumber.add(2);
       linkNumber.add(3);
       System.out.println("Total Numbers " + linkNumber);
       int getNumber = linkNumber.get(2);
       System.out.println("Get Number" + " " + getNumber);
       int positonNumber = linkNumber.indexOf(2);
       System.out.println("Position" + " " + positonNumber);
       int removeNumber = linkNumber.remove(2);
       System.out.println("Remove Number" + " " + removeNumber);
    }
}
