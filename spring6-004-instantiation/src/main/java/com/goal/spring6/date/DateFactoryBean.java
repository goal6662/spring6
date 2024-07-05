package com.goal.spring6.date;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工厂 Bean 协助创建日期对象，可以指定日期格式
 */
public class DateFactoryBean implements FactoryBean<Date> {

    private final String strDate;

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(strDate);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
