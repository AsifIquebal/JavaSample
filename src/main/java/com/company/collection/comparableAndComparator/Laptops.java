package com.company.collection.comparableAndComparator;

public class Laptops{

    String brand;
    int ram;
    int price;

    public Laptops(String brand, int ram, int price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Laptops setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public Laptops setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Laptops setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}'+"\n";
    }


}
