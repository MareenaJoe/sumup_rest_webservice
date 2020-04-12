package project.sumup_rest.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Event {
  UUID eventID;
  private String eventTitle;
  private List<String> saleItemList = new ArrayList<>();
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

  public List<String> getSaleItemList() {
    return saleItemList;
  }

  public void setSaleItemList(List<SaleItem> saleItemList) {
    saleItemList.forEach(item -> this.saleItemList.add(item.id));
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
