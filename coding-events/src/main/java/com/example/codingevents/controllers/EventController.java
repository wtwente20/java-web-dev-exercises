package com.example.codingevents.controllers;

import com.example.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName,
                              @RequestParam String eventDescription) {
        events.add(new Event(eventName, eventDescription));
        return "redirect:";
    }

}
