package com.lxt.demo;

import java.util.HashMap;
import java.util.Map;

/**************************************************************************
 * Description:map lambda表示式的使用
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/
public class MapLambda {
    private static Map<String, Integer> items = new HashMap<>();
    static {
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
    }

    public static void main(String[] args) {

    //遍历map
        items.forEach((key,values)-> System.out.println("Key:"+key+"  Values:"+values));

        items.forEach((key,values)-> {
            System.out.println("Key:"+key);
            System.out.println("Values:"+values);
        });

    }
}
