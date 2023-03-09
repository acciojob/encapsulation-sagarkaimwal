package com.driver;

public class Main {
    public static void main(String args[])
    {
        RWOnly a=new RWOnly();

        //System.out.println("'name' has private access in 'com.driver.RWOnly'");
        a.setName("sagar");
        System.out.println(a.getName());
    }
}