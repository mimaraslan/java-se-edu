package com.mimaraslan;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamdenListeye {

    public static void main(String[] args) {

        Stream <String> myStream = Stream.of("Oğuzhan", "Salih", "Süheda", "Berkay", "Banu", "Fatih", "Fatih");
        TreeSet <String> myTreeSet = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myTreeSet);
        System.out.println("------------------------------------");


        Stream <String> myStream2 = Stream.of("Oğuzhan", "Salih", "Süheda", "Berkay", "Banu", "Fatih", "Fatih");
        TreeSet <String> myTreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);
        System.out.println("------------------------------------");


        Stream <String> myStream3 = Stream.of("Oğuzhan", "Salih","Salih","Salih", "Süheda", "Berkay", "Banu", "Fatih", "Fatih");
/*        myStream3
                .sorted()
                .forEach(System.out::println);
*/
        myStream3
                .sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------------");

        Stream <String> myStream4 = Stream.of("Oğuzhan", "Salih","Salih","Salih", "Süheda", "Berkay", "Banu", "Fatih", "Fatih");

        HashSet <String> myTreeSet4 = myStream4
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(myTreeSet4);


    }
}
