package com.jaydeep.FShare.model;

public interface Comparable
{
    boolean comparisonSupported();

    String getComparableName();

    long getComparableDate();

    long getComparableSize();
}
