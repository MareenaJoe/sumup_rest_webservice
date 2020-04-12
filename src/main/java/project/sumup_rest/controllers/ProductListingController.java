package project.sumup_rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.sumup_rest.model.Product;
import project.sumup_rest.service.ProductsListing;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductListingController {
  @GetMapping("/{id}")
  public Product getProductById(@PathVariable int id) {
    return ProductsListing.getProductById(id);
  }

  @GetMapping("")
  public List<Product> getProducts() {
    System.out.println("Get request recd for products");
    return ProductsListing.getAllProducts();
  }
}
