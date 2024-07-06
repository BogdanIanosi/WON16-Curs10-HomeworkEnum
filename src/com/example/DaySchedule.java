package com.example;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private Day day;
    private List<String> activities;

    public DaySchedule(Day day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }

    public static void main(String[] args) {
        // Example usage
        DaySchedule mondaySchedule = new DaySchedule(Day.MONDAY);
        mondaySchedule.addActivity("Go to gym");
        mondaySchedule.addActivity("Attend meeting");

        System.out.println(mondaySchedule);
    }
}
