package org.example;

public class User {
    private String firstname;

    String number;
    private Region region;

    public User(String firstname, String number, Region region) {
        this.firstname = firstname;
        this.number = number;
        this.region = region;
    }

    public Region getRegion() {
        return this.region;
    }

    public String getFirstName() {
        return this.firstname;
    }

    @Override
    public String toString() {
        return firstname + " (" + region.getIndicatif() + ")";
    }
}

