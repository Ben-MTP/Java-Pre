package com.jindo.core.interfacex;

/**
 * @author ManhKM on 5/25/2022
 * @project core-java-volume-1-fundamentals
 */
public class LengthComparator implements Comparator<String>, java.util.Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }

}
