package com.company.collection.comparableAndComparator;

import org.testng.annotations.Test;

import java.util.*;

public class Tests {


    @Test
    public void test_comparable(){

        Users user1 = new Users();
        user1.setUsername("ASarkar");
        user1.setRoll("1");

        Users user2 = new Users();
        user2.setUsername("BSarkar");
        user2.setRoll("2");

        Users user3 = new Users();
        user3.setUsername("aSarkar");
        user3.setRoll("3");

        List<Users> usersList = new ArrayList<Users>();
        usersList.add(user2);
        usersList.add(user1);
        usersList.add(user3);

        System.out.println("Before sort: \n" + usersList);
        Collections.sort(usersList);

        System.out.println("After sort: \n" + usersList);

        System.out.println("After shuffling...");
        Collections.shuffle(usersList);
        System.out.println(usersList);
    }

    @Test
    public void usingCollectionSort(){
        String[] strNames = new String[]{"John", "Asif", "asif", "alex", "Chris", "williams", "Mark", "Bob"};
        Collections.sort(Arrays.asList(strNames), String.CASE_INSENSITIVE_ORDER);
        for(String x:strNames){
            System.out.println(x);
        }
        //System.out.println(strNames);
    }

    @Test
    public void test_comparator(){
        String a = "ASarkar";
        String b = "BSarkar";
        String c = "aSarkar";
        List<String> list = new ArrayList<>();
        list.add(b);
        list.add(a);
        list.add(c);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println(list);
    }

    @Test
    public void comparableDemo(){
        Laptop laptop = new Laptop("Dell", 12, 800);
        Laptop laptop1 = new Laptop("Apple", 16, 1200);
        Laptop laptop3 = new Laptop("Lenovo", 12, 1000);
        Laptop laptop4 = new Laptop("HP",4,900);
        List<Laptop> laptops = new ArrayList<>();
        /*laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop3);
        laptops.add(laptop4);*/
        // addAll method of Collections class
        Collections.addAll(laptops,laptop,laptop1,laptop3,laptop4);
        // the overridden compareTo method of Laptop sorts only on RAM size
        Collections.sort(laptops);
        laptops.forEach(System.out::println);
    }

    @Test
    public void ComparatorUsingAnnonymousClass(){
        Comparator<Laptops> comparator = new Comparator<Laptops>() {
            @Override
            public int compare(Laptops l1, Laptops l2) {
                return (l1.getPrice()<l2.getPrice())?-1:(l1.getPrice()>l2.getPrice())?1:0;
            }
        };
        Laptops laptop = new Laptops("Dell", 12, 800);
        Laptops laptop1 = new Laptops("Apple", 16, 1200);
        Laptops laptop3 = new Laptops("Lenovo", 12, 1000);
        Laptops laptop4 = new Laptops("HP",4,900);

        List<Laptops> laptops = new ArrayList<>();
        laptops.add(laptop);
        laptops.add(laptop1);
        laptops.add(laptop3);
        laptops.add(laptop4);

        Collections.sort(laptops, comparator);
        laptops.forEach(System.out::println);
    }

    @Test
    public void ComparatorUsingLambdaExpression(){
        Laptops laptop0 = new Laptops("Dell", 12, 800);
        Laptops laptop1 = new Laptops("Apple", 16, 1200);
        Laptops laptop3 = new Laptops("Lenovo", 12, 1000);
        Laptops laptop4 = new Laptops("HP",4,900);

        List<Laptops> laptops = new ArrayList<>();
        laptops.add(laptop0);
        laptops.add(laptop1);
        laptops.add(laptop3);
        laptops.add(laptop4);

        System.out.println("Sorted based on price");
        Comparator<Laptops> priceComparator = (Laptops l1, Laptops l2)->
                (l1.getPrice()<l2.getPrice())?-1:(l1.getPrice()>l2.getPrice())?1:0;
        Collections.sort(laptops, priceComparator);
        laptops.forEach(System.out::println);

        System.out.println("Sorted based on ram size");
        Comparator<Laptops> ramSizeComparator = (Laptops l1, Laptops l2)->
                (l1.getRam()<l2.getRam())?-1:(l1.getRam()>l2.getRam())?1:0;
        Collections.sort(laptops, ramSizeComparator);
        laptops.forEach(System.out::println);

        //Sort by brand
        laptops.sort(Comparator.comparing(e -> e.getBrand()));
        System.out.println("Sort by Brand Name============================");
        laptops.forEach(System.out::println);

        //OR you can use below
        laptops.sort(Comparator.comparing(Laptops::getBrand));
        laptops.forEach(System.out::println);

        //Sort by brand in reverse order
        Comparator<Laptops> comparator = Comparator.comparing(e -> e.getBrand());
        laptops.sort(comparator.reversed());
        laptops.forEach(System.out::println);
    }



}
