package project.sumup_rest.model;

import java.util.UUID;

public class SaleItem {
  String id;
  String name;
  double price;

  public SaleItem(String name, double price) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "SaleItem{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + '}';
  }
}
