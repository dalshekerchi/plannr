package com.generic.plannr.UseCases;


import com.generic.plannr.Entities.Event;

import java.util.ArrayList;

/**
 * A data structure for the current user's list of events
 */
public class EventList {
    private final ArrayList<Event> eventList = new ArrayList<>();

    /**
     * Returns a list of the current user's events
     *
     * @return an array list of the user's events
     */
    public ArrayList<Event> getEventList() {
        return eventList;
    }

    /**
     * Add an event to eventList
     *
     * @param e The event to be added
     */
    public void add (Event e) {
        eventList.add(e);
    }

    /**
     * Clears the list of events for the next user to log in/sign up
     * To be used whenever a user logs out
     */
    public void clear() {
        eventList.clear();
    }
}
