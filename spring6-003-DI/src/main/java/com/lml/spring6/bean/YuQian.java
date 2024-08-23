package com.lml.spring6.bean;

import java.util.Arrays;

public class YuQian {
    private String[] hobbys;
    private Woman[] womans;

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public void setWomans(Woman[] womans){
        this.womans = womans;
    }

    @Override
    public String toString() {
        return "YuQian{" +
                "hobbys=" + Arrays.toString(hobbys) +
                ", womans=" + Arrays.toString(womans) +
                '}';
    }
}
