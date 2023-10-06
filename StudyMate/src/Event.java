public class Event {
    private String event_name;
    private String start_time;
    private String end_time;
    private String event_date;

    public Event(String event_name, String start_time, String end_time, String event_date) {
        this.event_name = event_name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.event_date = event_date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event_name='" + event_name + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", event_date='" + event_date + '\'' +
                '}';
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }
}
