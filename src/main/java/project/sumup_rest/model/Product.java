package project.sumup_rest.model;

import project.sumup_rest.service.Category;

public class Product {
  int id;
  Category category;
  String name;
  double price;

  public Product(Category category, int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public Category getCategory() {
    return category;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}
