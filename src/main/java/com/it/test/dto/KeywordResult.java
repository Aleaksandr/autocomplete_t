package com.it.test.dto;

public class KeywordResult {

    private String value;
    private String data;

    public KeywordResult(String value) {
        this.value = value;
        this.data = value;
    }

    public String getValue() {
        return value;
    }

    public KeywordResult setValue(String value) {
        this.value = value;
        return this;
    }

    public String getData() {
        return data;
    }

    public KeywordResult setData(String data) {
        this.data = data;
        return this;
    }
}
