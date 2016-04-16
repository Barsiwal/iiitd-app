package in.ac.iiitd.iiitdapp.model.pojo;

import java.util.Calendar;

/**
 * Created by karan barsiwal on 16-04-2016.
 */
public class AlarmPojo {
    String name;
    Calendar calendar;
    int interval;
    String Title;
    String message;
    public AlarmPojo(String name, Calendar calendar, int interval, String title, String message){
        this.name=name;
        this.calendar=calendar;
        this.interval=interval;
        this.Title=title;
        this.message=message;
    }
    public String getName() {
        return name;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public int getInterval() {
        return interval;
    }

    public String getTitle() {
        return Title;
    }

    public String getMessage() {
        return message;
    }
}
