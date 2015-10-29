package com.example;

public class SimpleConfig {

    int count;

    public SimpleConfig() {}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SimpleConfig [count=" + count + "]";
    }
}
