package com.goal.spring6.bean;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

@ToString
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
                                                        InitializingBean,
                                                        DisposableBean {

    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("1. 创建对象【有参】");
    }

    public User() {
        System.out.println("1. 创建对象");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. 属性赋值");
    }

    public void initBean() {
        System.out.println("3. 初始化Bean");
    }

    public void destroyBean() {
        System.out.println("5. 销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("    Aware2: ClassLoader-" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("    Aware3: BeanFactory-" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("    Aware1: BeanName-" + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("    InitializingBean: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("    DisposableBean: destroy");
    }
}
