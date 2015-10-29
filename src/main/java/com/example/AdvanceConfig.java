package com.example;

public class AdvanceConfig {

    String key;
    int count;

    public AdvanceConfig() {}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "AdvanceConfig [key=" + key + ", count=" + count + "]";
    }
}
