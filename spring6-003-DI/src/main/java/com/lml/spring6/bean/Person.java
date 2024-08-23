package com.lml.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<String> names;
    private Set<String> address;
    private Map<Integer,String> phones;
    private Properties properties;


    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setPhones(Map<Integer, String> phones) {
        this.phones = phones;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", phones=" + phones +
                ", properties=" + properties +
                '}';
    }
}
