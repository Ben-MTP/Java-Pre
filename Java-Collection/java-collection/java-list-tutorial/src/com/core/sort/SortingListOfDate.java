package com.core.sort;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author ManhKM on 8/24/2022
 * @project java-collection
 */
public class SortingListOfDate {

    public static void main(String[] args) {
        List<Date> listDates = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            listDates.add(dateFormat.parse("1996-04-30"));
            listDates.add(dateFormat.parse("1993-04-30"));
            listDates.add(dateFormat.parse("1995-04-30"));
            listDates.add(dateFormat.parse("1996-04-20"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Before sorting: " + listDates);

        Collections.sort(listDates);

        System.out.println("After sorting: " + listDates);
    }
}
