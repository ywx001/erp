package com.sn.entity.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ResultMap extends HashMap<String, Object> {
    public ResultMap() {
    }

    public ResultMap success() {
        this.put("code", 0);
        return this;
    }

    public ResultMap fail() {
        this.put("code", 1);
        return this;
    }

    public ResultMap data(Object data) {
        this.put("data", data);
        return this;
    }

    public ResultMap msg(String msg) {
        this.put("msg", msg);
        return this;
    }
}

