package ir.ashkanmarket.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AshkanmarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshkanmarketApplication.class, args);
    }
}

//create controller named PublicController which we can edit/get/add(CRUD) data with it on Product
//read Lombok --> what is @Builder/@Data/@Getter/@Setter?
// write builder pattern (java syntax) for Brand
//OneToOne relation Product with Brand and Category