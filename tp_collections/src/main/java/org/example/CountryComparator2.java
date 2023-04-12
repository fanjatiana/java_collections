package org.example;

import java.util.Comparator;

public class CountryComparator2 implements Comparator<Country> {

    @Override
    public int compare(Country c1, Country c2) {
        int length1 = c1.getName().split(" ").length;
        int length2 = c2.getName().split(" ").length;
        return Integer.compare(length2, length1);
    }
}
