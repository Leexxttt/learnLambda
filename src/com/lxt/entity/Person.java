package com.lxt.entity;

/**************************************************************************
 * Description:
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/

public class Person {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }
}
