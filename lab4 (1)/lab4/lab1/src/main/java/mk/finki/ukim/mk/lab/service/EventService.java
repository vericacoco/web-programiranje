package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Event;

import java.util.List;

public interface EventService {
    List<Event> listAll();
    List<Event> searchEventsByText(String text);
    List<Event> searchEventsByRating(Double rating);
    List<Event> searchEventsByTextAndRating(String text, Double rating);
    void addEvent(String name, String description, double popularityScore, Long locationId);
    void editEvent(Long eventId, String name, String description, double popularityScore, Long locationId);
    void deleteEvent(Long eventId);
    Event findEventById(Long eventId);
    List<Event> findAllByLocationId(Long locationId);
}
