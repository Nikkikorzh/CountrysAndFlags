package com.example.countrysandflags;

public class Country {
    private String name;
    private int flagId;

    public Country(String name,int flagId){

        this.name=name;
        this.flagId = flagId;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlagId() {
        return this.flagId;
    }

    public void setFlagResource(int flagId) {
        this.flagId = flagId;
    }
}

