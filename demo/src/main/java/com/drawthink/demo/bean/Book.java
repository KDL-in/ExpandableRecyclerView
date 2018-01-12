package com.drawthink.demo.bean;


public class Book {
    private String name;


    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return name.equals(b.getName());
    }
}