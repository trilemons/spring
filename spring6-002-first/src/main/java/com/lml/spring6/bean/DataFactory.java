package com.lml.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFactory implements FactoryBean<Date> {
    private String strData;

    public void setStrData(String strData) {
        this.strData = strData;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(strData);

        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
