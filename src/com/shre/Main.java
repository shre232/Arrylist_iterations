package com.shre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    static public void main(String [] args) {
       // boolean b=1;
        ArrayList <String> arr =new ArrayList<>();

        arr.add("Rupali");
        arr.add("Shreyash");
        arr.add("Vedu");
        arr.add("Sujit");

        System.out.println(arr);
        for (String name:arr) {

            StringBuffer br=new StringBuffer(name);
            br.append("hi");
            System.out.println(name+" "+name.length());
            System.out.println(br.reverse());
        }
        // iterrator

        Iterator<String> itr = arr.iterator();
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
           // System.out.println(itr);
        }

        System.out.println("_________________________________");

        ListIterator<String> lstr = arr.listIterator(arr.size());
        while(lstr.hasPrevious()){
            String previous = lstr.previous();
            System.out.println(previous);

            System.out.println("------for each method-----");
           arr.forEach(e->{
               System.out.println(e);
           });

        }
    }
}