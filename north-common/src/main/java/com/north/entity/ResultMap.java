package com.north.entity;

import java.util.HashMap;
import java.util.Map;

public class ResultMap  {

    private Map data;

    private ResultMap() {

    }

    public static ResultMap builder(){
        ResultMap rm = new ResultMap();
        rm.data = new HashMap();
        return rm;
    }

    public ResultMap put(String key,Object value){
        this.data.put(key,value);
        return this;
    }
}
