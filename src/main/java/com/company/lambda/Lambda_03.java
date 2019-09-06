package com.company.lambda;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_03 {

    @Test
    public void lambda_01() {
        List<Persons> personsList = Arrays.asList(
                new Persons("Picasso", "Bhowmick", 32,""),
                new Persons("Asif", "Sarkar",33,""),
                new Persons("Sudip", "Paul", 31,""),
                new Persons("Amlan", "Chackroborty", 30,""),
                new Persons("Manish", "Agarwal", 29,"")
                );

        //int foundIndex = Arrays.binarySearch(names, "Mary");
        // sort list by last name

        // JDK 7 approach
        Collections.sort(personsList, new Comparator<Persons>(){
            @Override
            public int compare(Persons p1, Persons p2){
                return p1.getLname().compareToIgnoreCase(p2.getLname());
            }
        });
        System.out.println(personsList);
        Collections.shuffle(personsList);

        // now using lambda
        Collections.sort(personsList,(p1,p2)-> p1.getLname().compareToIgnoreCase(p2.getLname()));

        // create a method that print all elements of the list

        // create a method that prints all elements where last name starts with A
        System.out.println("Print all persons where last name starts with A");
        /*printConditionally(personsList, new Condition() {
            @Override
            public boolean test(Persons p) {
                return p.getLname().startsWith("A");
            }
        });*/

        printConditionally(personsList, new Predicate<Persons>() {
            @Override
            public boolean test(Persons p) {
                return p.getLname().startsWith("A");
            }
        });
        // using lambda
        System.out.println("-----------------------------------");
        printConditionally(personsList, p->p.getLname().startsWith("A"));

        System.out.println("Printing all person where first name starts with A");
        printConditionally(personsList, p -> p.getName().startsWith("A"));
        // print all
        //printConditionally(personsList, p->true);
    }

    /*private void printConditionally(List<Persons> personsList, Condition condition){
        for (Persons p : personsList){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }*/

    //there already a interface present in java.utilfunction package
    private void printConditionally(List<Persons> personsList, Predicate<Persons> predicate){
        for (Persons p : personsList){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }
}

interface Condition{
    boolean test(Persons p);
}
