package com.mycompany.listarraylist;

import java.util.ArrayList;
import java.util.List;

public class ListArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Total Numbers " + numbers);
        int getNumber = numbers.get(2);
        System.out.println("Get Number" + " " + getNumber);
        int removeNumber = numbers.remove(2);
        System.out.println("Remove Number" + " " + removeNumber);
    }
}
