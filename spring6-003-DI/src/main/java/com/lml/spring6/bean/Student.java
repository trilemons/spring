package com.lml.spring6.bean;

public class Student {
    private int sno;
    private Clazz c;

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setC(Clazz c) {
        this.c = c;
    }

    public Clazz getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", c=" + c +
                '}';
    }


}
