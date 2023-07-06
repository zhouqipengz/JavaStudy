package org.example;

public class Puppy {
    int puppyage;
    public  Puppy(String name)
    {
        System.out.println("宠物的名字是:"+name);
    }
    public void setage(int age)
    {
        puppyage = age;
    }
    public int gerage()
    {
        System.out.println("宠物的年龄为:"+puppyage);
        return puppyage;
    }
    public static void main(String[]args)
    {
        Puppy mypuppy = new Puppy("球球");
        mypuppy.setage(3);
        mypuppy.gerage();
    }
}
