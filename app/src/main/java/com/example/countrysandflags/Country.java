package com.example.countrysandflags;

public class Country {
    private String name;
    private int flagId;

    private int size;

    private String capital;

    public Country(String name,int flagId,int size,String capital){

        this.name=name;
        this.flagId = flagId;
        this.size = size;
        this.capital = capital;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }
    public int getFlagId() {
        return this.flagId;
    }

    public void setFlagResource(int flagId) {
        this.flagId = flagId;
    }
}
