package com.lxt.demo;

import com.google.common.collect.Lists;
import com.lxt.entity.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**************************************************************************
 * Description:groupby  lambda
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/
public class GroupByLambda {

    private static List<Person> personList = Lists.newArrayList();

    static {
        personList.add(new Person().setName("lisi").setAddress("江苏").setId(1));
        personList.add(new Person().setName("wangwu").setAddress("上海").setId(1));
        personList.add(new Person().setName("zhangsan").setAddress("杭州").setId(3));
    }

    public static void main(String[] args) {
        //分组
        Map<Integer, List<Person>> collect = personList.stream().collect(Collectors.groupingBy((c -> c.getId())));
       collect.forEach((key,value)->{
           System.out.println("key:"+key+" Value:"+value.size());
       });
    }
}
