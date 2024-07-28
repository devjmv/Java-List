package com.list.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Weekend {

    private List<String> days = new ArrayList<>();

    public Weekend() {
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        return null;
    }

    public List<String> getDays() {
        return days;
    }

    public int getDaysCount() {
        return days.size();
    }

    public void removeDay(String day) {
        days.remove(day);
    }

    public boolean removeDays(String day) {
        return days.remove(day);
    }

    public boolean dayExists(String day) {
        return days.contains(day);
    }

    public void sortAlphabetically() {
        Collections.sort(days);
    }

    public void clearList() {
        days.clear();
    }
}
