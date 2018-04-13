package com.lxt.demo;

import com.google.common.collect.Lists;
import com.lxt.entity.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**************************************************************************
 * Description:list转换成map lambda
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/
public class ListToMapLambda {

    private static List<Person> personList = Lists.newArrayList();

    static {
        personList.add(new Person().setName("lisi").setAddress("江苏").setId(1));
        personList.add(new Person().setName("wangwu").setAddress("上海").setId(2));
        personList.add(new Person().setName("zhangsan").setAddress("杭州").setId(3));
    }

    public static void main(String[] args) {
        Map<Integer, Person> collect = personList.stream().collect(Collectors.toMap((key -> key.getId()), (value -> value)));

        collect.forEach((key,value)-> System.out.println("key"+key+"value"+value.getId()));
        System.out.println("===================================================");
        Map<Integer, String> collect1 = personList.stream().collect(Collectors.toMap(Person::getId, Person::getAddress));
        collect1.forEach((key,value)-> System.out.println("key:"+key+"value:"+value));

    }

}
