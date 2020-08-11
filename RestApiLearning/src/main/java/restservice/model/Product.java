package restservice.model;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private String store;
    private String price;

}
