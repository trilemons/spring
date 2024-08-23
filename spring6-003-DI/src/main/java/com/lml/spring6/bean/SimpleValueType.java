package com.lml.spring6.bean;

import java.util.Date;

public class SimpleValueType{
    private Season season;
    private int age;
    private Integer aage;
    private boolean bl;
    private Boolean ble;
    private char c;
    private Character ch;
    private Class clazz;

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAage(Integer aage) {
        this.aage = aage;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }

    public void setBle(Boolean ble) {
        this.ble = ble;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "SimpleValueType{" +
                "season=" + season +
                ", age=" + age +
                ", aage=" + aage +
                ", bl=" + bl +
                ", ble=" + ble +
                ", c=" + c +
                ", ch=" + ch +
                ", clazz=" + clazz +
                '}';
    }
}
