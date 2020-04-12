package project.sumup_rest.service;

import project.sumup_rest.model.Event;
import project.sumup_rest.model.SaleItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class EventsService {
  final Map<UUID, Event> eventsMap;
  final List<Event> eventList;
  final List<SaleItem> saleItemList;

  public EventsService() {
    eventList = getRandomEventList();
    saleItemList = getRandomSaleItemList();
    eventsMap = new ConcurrentHashMap<>();
    int count = 0;
    int max = 9;
    for (Event event : eventList) {
      eventsMap.put(event.getEventID(), event);
      event.setSaleItemList(saleItemList.subList(count++, max--));
    }
  }

  public Event findById(UUID id) {
    return eventsMap.get(id);
  }

  public void addEvent(Event event) {
    System.out.println("Adding new event: " + event);
    eventsMap.put(event.getEventID(), event);
  }

  public List<Event> getAll() {
    return eventsMap.values().stream().collect(Collectors.toList());
  }

  public void removeById(UUID uuid) {
    eventsMap.remove(uuid);
  }

  public void updateEvent(Event event) {
    eventsMap.replace(event.getEventID(), event, event);
  }

  public SaleItem findSaleItemById(UUID fromString) {
    return saleItemList.stream()
        .filter(item -> item.getId().equalsIgnoreCase(fromString.toString()))
        .findFirst()
        .get();
  }

  private List<Event> getRandomEventList() {
    List<Event> eventsList = new ArrayList<>();
    Event event1 = new Event("Bake Sale", "Description of event1");
    Event event2 = new Event("Cricket 2020", "Dec 2");
    Event event3 = new Event("Soccer 2020", "Desc 3");
    Event event4 = new Event("Christmas Celebration", "Desc4");
    eventsList.add(event1);
    eventsList.add(event2);
    eventsList.add(event3);
    eventsList.add(event4);
    return eventsList;
  }

  private List<SaleItem> getRandomSaleItemList() {
    List<SaleItem> itemList = new ArrayList<>();
    SaleItem saleItem1 = new SaleItem("Tea", 2.0);
    SaleItem saleItem2 = new SaleItem("Coffee", 2.5);
    SaleItem saleItem3 = new SaleItem("Scones", 1.5);
    SaleItem saleItem4 = new SaleItem("Pastry1", 1.23);
    SaleItem saleItem5 = new SaleItem("Pastry2", 1.35);
    SaleItem saleItem6 = new SaleItem("Pastry3", 1.35);
    SaleItem saleItem7 = new SaleItem("Pastry4", 1.35);
    SaleItem saleItem8 = new SaleItem("Pastry5", 1.35);
    SaleItem saleItem9 = new SaleItem("Pastry6", 1.35);
    SaleItem saleItem10 = new SaleItem("Pastry7", 1.35);
    itemList.add(saleItem1);
    itemList.add(saleItem2);
    itemList.add(saleItem3);
    itemList.add(saleItem4);
    itemList.add(saleItem5);
    itemList.add(saleItem6);
    itemList.add(saleItem7);
    itemList.add(saleItem8);
    itemList.add(saleItem9);
    itemList.add(saleItem10);
    return itemList;
  }
}
