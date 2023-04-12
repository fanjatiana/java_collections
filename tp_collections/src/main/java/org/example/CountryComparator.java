package org.example;

import java.util.Comparator;

class CountryComparator implements Comparator<Country> {

    private boolean isSortedAsc;

    public CountryComparator(boolean isSortedAsc) {
        this.isSortedAsc = isSortedAsc;
    }

    @Override
    public int compare(Country c1, Country c2) {
        int resultSort = c1.getName().compareTo(c2.getName());
        return isSortedAsc ? resultSort : -resultSort;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }
}
