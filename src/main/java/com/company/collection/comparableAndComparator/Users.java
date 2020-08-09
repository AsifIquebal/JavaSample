package com.company.collection.comparableAndComparator;

public class Users implements Comparable<Users>{
    String username;
    String roll;

    public String getUsername() {
        return username;
    }

    public Users setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getRoll() {
        return roll;
    }

    public Users setRoll(String roll) {
        this.roll = roll;
        return this;
    }

    @Override
    public int compareTo(Users o) {
        return this.username.compareTo(o.getUsername());
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
