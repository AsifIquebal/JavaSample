package com.company.collection.comparableAndComparator;

public class Laptop implements Comparable<Laptop> {

    String brand;
    int ram;
    int price;

    public Laptop(String brand, int ram, int price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Laptop setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public Laptop setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Laptop setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public int compareTo(Laptop laptop) {
        if(this.getRam() > laptop.getRam())
            return 1;
        if(this.getRam() < laptop.getRam())
            return -1;
        else
            return 0;
        //return this.ram - laptop.getRam(); // natural order
        //return laptop.getRam() - this.ram; // reverse order
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }


}
