package by.training.wlood.s05_basics_of_oop.task3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Calendar {

    private List<DayOff> dayOffList;

    public Calendar() {
        dayOffList = new ArrayList<>();
    }

    public Calendar(List<DayOff> dayOffList) {
        this.dayOffList = dayOffList;
    }

    public List<DayOff> getDayOffList() {
        return dayOffList;
    }

    public void setDayOffList(List<DayOff> dayOffList) {
        this.dayOffList = dayOffList;
    }

    public void addDayOff(Date date) {
        dayOffList.add(new DayOff(date));
    }

    public void addDayOff(Date date, String description) {
        dayOffList.add(new DayOff(date, description));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(dayOffList, calendar.dayOffList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOffList);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dayOffList=" + dayOffList +
                '}';
    }

    private class DayOff {
        private Date date;
        private String description;

        public DayOff() {
        }

        public DayOff(Date date) {
            this.date = date;
        }

        public DayOff(Date date, String description) {
            this.date = date;
            this.description = description;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DayOff dayOff = (DayOff) o;
            return Objects.equals(date, dayOff.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date);
        }

        @Override
        public String toString() {
            return "dayOff{" +
                    "date=" + date +
                    '}';
        }
    }
}
