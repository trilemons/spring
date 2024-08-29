package org.spring.bean;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class Gay {
    @Resource
    private Man man;

    public void printMan(){
        System.out.println(man.toString());
    }
}
