package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

 @GetMapping
 public List<Product> getAllProducts() {
     return Arrays.asList(
         new Product("1", "Laptop", 1200.00),
         new Product("2", "Smartphone", 800.00),
         new Product("3", "Tablet", 400.00)
     );
 }
}
