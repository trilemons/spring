package com.lml.spring6.bean;

public class Cat {
    private int weight;
    private String feet;
    private int sex;

    public Cat(int weight, String feet, int sex) {
        this.weight = weight;
        this.feet = feet;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", feet='" + feet + '\'' +
                ", sex=" + sex +
                '}';
    }
}
