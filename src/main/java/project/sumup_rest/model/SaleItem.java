package project.sumup_rest.model;

public class SaleItem {
  Integer id;
  String name;
  double price;

  public SaleItem(Integer id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public Integer getId() {
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
