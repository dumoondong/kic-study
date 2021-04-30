package com.naver;

public class Student{
    // public String hakbun;
    // public String name;
    // public int age;
    // public double height;

    private String hakbun;
    private String name;
    private int age;
    private double height;

    //getter /setter
    public void setHakbun(String hakbun){
        this. hakbun = hakbun;
    }
    public String getHakbun(){
        return hakbun;
    }
    public void setName(String name){
        this. name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this. age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(double height){
        this. height = height;
    }
    public double getHeight(){
        return height;
    }
}