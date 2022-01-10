package com.example.crow;

public class Increment {
    private int value;

    public Increment(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incrementer() {
        this.value++;
    }

    public void zeroing(int zero){
        value = zero;
    }
}
