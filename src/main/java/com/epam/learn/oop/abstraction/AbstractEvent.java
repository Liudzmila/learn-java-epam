package main.java.com.epam.learn.oop.abstraction;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {

    private final Long createdTimestamp;
    protected final String id;

    public AbstractEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    public Long getTimeStamp() {
        return this.createdTimestamp;
    }

    public abstract void process();
}

