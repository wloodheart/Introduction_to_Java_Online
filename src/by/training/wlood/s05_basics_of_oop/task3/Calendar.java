package by.training.wlood.s05_basics_of_oop.task3;

import java.util.Date;
import java.util.Objects;

public class Calendar {

    private class dayOff {
        private Date date;
        private String description;

        public dayOff() {
        }

        public dayOff(Date date) {
            this.date = date;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            dayOff dayOff = (dayOff) o;
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
