package org.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gun {
    @Value("冲锋枪")
    private String name;
    @Value("1")
    private int length;

    private void shotFire(){
        System.out.println("射击");
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
