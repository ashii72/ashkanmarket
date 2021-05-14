package ir.ashkanmarket.backend.service;

import ir.ashkanmarket.backend.domain.entity.Product;
import ir.ashkanmarket.backend.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> findProductById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public Optional<Product> findProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product editProductById(long id) {
        return productRepository.editById(id);
    }

    @Override
    public Product editProductByName(String name) {
        return productRepository.editByName(name);
    }

    @Override
    public Product deleteProductById(long id) {
        return productRepository.deleteById(id);
    }

    @Override
    public Product deleteProductByName(String name) {
        return productRepository.deleteByName(name);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllProductsByOrderByNameAsc() {
        return productRepository.findAllByOrderByNameAsc();
    }

    @Override
    public List<Product> findAllProductsByOrderByNameDesc() {
        return productRepository.findAllByOrderByNameDesc();
    }

    @Override
    public List<Product> findAllProductsByOrderByPriceAsc() {
        return productRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Product> findAllProductsByOrderByPriceDesc() {
        return productRepository.findAllByOrderByPriceDesc();
    }
}
