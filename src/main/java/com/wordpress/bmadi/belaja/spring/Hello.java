package com.wordpress.bmadi.belaja.spring;

public class Hello {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void printHello(){
        System.out.println("Belajar Spring : Hello " + name);
    }

}
