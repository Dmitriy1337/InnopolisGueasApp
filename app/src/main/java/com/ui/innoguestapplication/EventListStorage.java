package com.ui.innoguestapplication;

public class EventListStorage {

    public synchronized static void setEventList(EventList eventList) {
        EventListStorage.eventList = eventList;
    }

    public static EventList eventList = null;




}
