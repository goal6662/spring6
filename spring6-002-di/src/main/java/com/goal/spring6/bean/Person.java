package com.goal.spring6.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Person {

    private List<String> names;

    private Set<String> address;

    private Map<Integer, String> phones;

}
