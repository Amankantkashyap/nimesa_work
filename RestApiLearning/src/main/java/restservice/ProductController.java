package restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import restservice.model.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("product")
    public List<Product> get() {
        Product product = new Product();
        product.setId(1);
        product.setName("Product1");
        product.setStore("Store1");
        product.setPrice("200");
        List<Product> response = new ArrayList<>();
        response.add(product);
        return response;
    }
}
