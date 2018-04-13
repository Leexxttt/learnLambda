package com.lxt.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**************************************************************************
 * Description:list lambda表达式的使用
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/
public class ListLambda {


    private static List<String> list=new ArrayList<String>();

    static {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    public static void main(String[] args) {
        //lambda表达式遍历list
        list.forEach(c -> System.out.println(c));

        //循环中加入判断条件
        list.forEach(c -> {
            if("C".equals(c)){
                System.out.println(c);
            }
        });
        System.out.println("----------------------------------");
        Stream<String> b = list.stream().filter(s -> s.contains("B"));

        list.stream().filter(s->s.contains("B")).forEach(c-> System.out.println(c));

    }
}
