package ir.ashkanmarket.backend.service;

import ir.ashkanmarket.backend.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findProductById(long id);
    Optional<Product> findProductByName(String name);

    Product saveProduct(Product product);
    Product editProductById(long id);
    Product editProductByName(String name);

    Product deleteProductById(long id);
    Product deleteProductByName(String name);

    List<Product> findAllProducts();
    List<Product> findAllProductsByOrderByNameAsc();
    List<Product> findAllProductsByOrderByNameDesc();
    List<Product> findAllProductsByOrderByPriceAsc();
    List<Product> findAllProductsByOrderByPriceDesc();


}
