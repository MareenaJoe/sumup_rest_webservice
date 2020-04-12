package project.sumup_rest.service;

import project.sumup_rest.model.Product;

import java.util.Arrays;
import java.util.List;

public class ProductsListing {
  static List<Product> allProducts =
      Arrays.asList(
          new Product(Category.accessories, 0, "Vagabond sack", 120),
          new Product(Category.accessories, 1, "Stella sunglasses", 58),
          new Product(Category.accessories, 2, "Whitney belt", 35),
          new Product(Category.accessories, 3, "Garden strand", 98),
          new Product(Category.accessories, 4, "Strut earrings", 34),
          new Product(Category.accessories, 5, "Varsity socks", 12),
          new Product(Category.accessories, 6, "Weave keyring", 16),
          new Product(Category.accessories, 7, "Gatsby hat", 40),
          new Product(Category.accessories, 8, "Shrug bag", 198),
          new Product(Category.home, 9, "Gilt desk trio", 58),
          new Product(Category.home, 10, "Copper wire rack", 18),
          new Product(Category.home, 11, "Soothe ceramic set", 28),
          new Product(Category.home, 12, "Hurrahs tea set", 34),
          new Product(Category.home, 13, "Blue stone mug", 18),
          new Product(Category.home, 14, "Rainwater tray", 27),
          new Product(Category.home, 15, "Chambray napkins", 16),
          new Product(Category.home, 16, "Succulent planters", 16),
          new Product(Category.home, 17, "Quartet table", 175),
          new Product(Category.home, 18, "Kitchen quattro", 129),
          new Product(Category.clothing, 19, "Clay sweater", 48),
          new Product(Category.clothing, 20, "Sea tunic", 45),
          new Product(Category.clothing, 21, "Plaster tunic", 38),
          new Product(Category.clothing, 22, "White pinstripe shirt", 70),
          new Product(Category.clothing, 23, "Chambray shirt", 70),
          new Product(Category.clothing, 24, "Seabreeze sweater", 60),
          new Product(Category.clothing, 25, "Gentry jacket", 178),
          new Product(Category.clothing, 26, "Navy trousers", 74),
          new Product(Category.clothing, 27, "Walter henley (white)", 38),
          new Product(Category.clothing, 28, "Surf and perf shirt", 48),
          new Product(Category.clothing, 29, "Ginger scarf", 98),
          new Product(Category.clothing, 30, "Ramona crossover", 68),
          new Product(Category.clothing, 31, "Chambray shirt", 38),
          new Product(Category.clothing, 32, "Classic white collar", 58),
          new Product(Category.clothing, 33, "Cerise scallop tee", 42),
          new Product(Category.clothing, 34, "Shoulder rolls tee", 27),
          new Product(Category.clothing, 35, "Grey slouch tank", 24),
          new Product(Category.clothing, 36, "Sunshirt dress", 58),
          new Product(Category.clothing, 37, "Fine lines tee", 58));

  /**
   * Get all products
   *
   * @return
   */
  public static List<Product> getAllProducts() {
    return allProducts;
  }

  /**
   * Get product by id
   *
   * @param id
   * @return Product or null
   */
  public static Product getProductById(int id) {
    return allProducts.stream().filter(product -> product.getId() == id).findFirst().get();
  }
}
