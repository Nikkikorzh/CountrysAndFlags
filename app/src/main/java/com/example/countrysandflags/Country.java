package com.example.countrysandflags;

public class Country {
    private String name;
    private int flagId;

    private String capital;

    private int size;

    public Country(String name,int flagId,String capital, int size){
        this.name=name;
        this.flagId = flagId;
        this.capital = capital;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagResource(int flagId) {
        this.flagId = flagId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

