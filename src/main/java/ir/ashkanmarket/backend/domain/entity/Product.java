package ir.ashkanmarket.backend.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Product {
    private long id;
    private String name;
    private long price;
    private String image;


}
