package com.example.jersey.data;

public class DemoDao implements BaseDao {
    private String value;

    @Override
    public void setRandomValue(String value) {
        this.value = value;
    }

    @Override
    public String getRandomValue() {
        return this.value;
    }
}
