package project.sumup_rest.controllers;

import org.springframework.web.bind.annotation.*;
import project.sumup_rest.model.Event;
import project.sumup_rest.model.SaleItem;
import project.sumup_rest.service.EventsService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/events")
public class EventController {

  EventsService service = new EventsService();

  @GetMapping("/{id}")
  public Event getEventById(@PathVariable String id) {
    return service.findById(UUID.fromString(id));
  }

  @GetMapping("/saleitem/{id}")
  public SaleItem getSaleItemById(@PathVariable int id) {
    return service.findSaleItemById(id);
  }

  @GetMapping("")
  public List<Event> getEvents() {
    System.out.println("Get request recd");
    return service.getAll();
  }

  @PostMapping("")
  public String addNewEvent(@RequestBody Event event) {
    service.addEvent(event);
    return "OK";
  }

  @DeleteMapping("/{id}")
  public String deleteEvent(@PathVariable String id) {
    service.removeById(UUID.fromString(id));
    return "OK";
  }
}
