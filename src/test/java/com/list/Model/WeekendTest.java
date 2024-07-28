package com.list.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeekendTest {
    private Weekend weekend;

    @BeforeEach
    public void setUp() {
        weekend = new Weekend();
    }

    @Test
    void testGetDay() {
        List<String> dayList = new ArrayList<>();
        dayList.add("Monday");
        dayList.add("Tuesday");
        dayList.add("Wednesday");
        dayList.add("Thursday");
        dayList.add("Friday");
        dayList.add("Saturday");
        dayList.add("Sunday");
        assertEquals(dayList, weekend.getDays());
    }

    @Test
    void testGetDays() {
        assertEquals("Tuesday", weekend.getDay(1));
        assertEquals("Wednesday", weekend.getDay(2));
        assertNull(weekend.getDay(10));
    }

    @Test
    void testGetDaysCount() {
        assertEquals(7, weekend.getDaysCount());
    }

    @Test
    void testRemoveDay() {
        assertTrue(weekend.removeDays("Monday"));
    }

    @Test
    void testRemoveDays() {
        weekend.removeDay("Monday");
        assertEquals("Tuesday", weekend.getDay(0));
    }

    @Test
    void testDayExists() {
        assertTrue(weekend.dayExists("Sunday"));
        assertFalse(weekend.dayExists("Null"));
    }

    @Test
    void testSortAlphabetically() {
        weekend.sortAlphabetically();
        List<String> dayList = weekend.getDays();
        assertEquals("Friday", dayList.get(0));
        assertEquals("Wednesday", dayList.get(6));
    }

    @Test
    void testClearList() {
        weekend.clearList();
        assertEquals(0, weekend.getDaysCount());
        assertTrue(weekend.getDays().isEmpty());
    }
}
