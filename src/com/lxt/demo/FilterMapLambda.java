package com.lxt.demo;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.stream.Collectors;

/**************************************************************************
 * Description:map 筛选
 *
 * @author:lixueteng
 * @date:2018/4/13 0013
 **************************************************************************/
public class FilterMapLambda {

    private static Map<Integer,String> map_ = Maps.newHashMap();

    static{
        map_.put(1, "linode.com");
        map_.put(2, "heroku.com");
        map_.put(3, "digitalocean.com");
        map_.put(4, "aws.amazon.com");
    }

    public static void main(String[] args) {
        String collect = map_.entrySet().stream().filter(map -> "heroku.com".equals(map.getValue())).map(map -> map.getValue()).collect(Collectors.joining());
        System.out.println(collect);

    }


}
