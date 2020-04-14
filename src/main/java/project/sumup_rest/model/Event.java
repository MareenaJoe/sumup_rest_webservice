package project.sumup_rest.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Event {
  UUID eventID;
  private String eventTitle;
  private Map<Integer, SaleItem> saleItemList = new HashMap<>();
  private String eventContent;
  private LocalDateTime createDateTime;

  public Event(String eventTitle, String eventContent) {
    this.eventID = UUID.randomUUID();
    this.eventTitle = eventTitle;
    this.eventContent = eventContent;
    createDateTime = LocalDateTime.now();
  }

  public String getEventContent() {
    return eventContent;
  }

  public List<SaleItem> getSaleItemList() {
    return saleItemList.values().stream().collect(Collectors.toList());
  }

  public void setSaleItemList(List<SaleItem> saleItemList) {
    saleItemList.forEach(item -> this.saleItemList.put(item.id, item));
  }

  public void setEventContent(String eventContent) {
    this.eventContent = eventContent;
  }

  public LocalDateTime getCreateDateTime() {
    return createDateTime;
  }

  public String getEventTitle() {
    return eventTitle;
  }

  public UUID getEventID() {
    return eventID;
  }

  public void setEventID(UUID eventID) {
    this.eventID = eventID;
  }

  public void setEventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
  }

  public void setCreateDateTime(LocalDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  @Override
  public String toString() {
    return "Event{"
        + "eventID="
        + eventID
        + ", eventTitle='"
        + eventTitle
        + '\''
        + ", saleItemList="
        + saleItemList
        + ", eventContent='"
        + eventContent
        + '\''
        + ", createDateTime="
        + createDateTime
        + '}';
  }
}
