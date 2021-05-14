package ir.ashkanmarket.backend.controller;

import ir.ashkanmarket.backend.domain.entity.Product;
import ir.ashkanmarket.backend.service.ProductService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class PublicController {

    final ProductService productService;

    public PublicController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/name")
    public Optional<Product> getByName(@RequestParam("name") String name) {
        return productService.findProductByName(name);
    }

    @GetMapping("/id/{id}")
    public Product getById(@PathVariable("id") long id) throws NotFoundException {
        return productService.findProductById(id).orElseThrow(() -> new NotFoundException("Product id " + id + " not found!"));
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("edit/{id}")
    public Product editProductById(@PathVariable("id") long id) {
        return productService.editProductById(id);
    }

    @PostMapping("edit/name")
    public Product editProductByName(@RequestParam("name") String name) {
        return productService.editProductByName(name);
    }

    @GetMapping("/delete/{id}")
    public Product deleteProductById(@PathVariable("id") long id) {
        return productService.deleteProductById(id);
    }

    @GetMapping("delete/name")
    public Product deleteProductByName(@RequestParam("name") String name) {
        return productService.deleteProductByName(name);
    }

    @GetMapping("/list")
    public List<Product> finaAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/sort/name/asc")
    public List<Product> findAllProductsByOrderByNameAsc() {
        return productService.findAllProductsByOrderByNameAsc();
    }

    @GetMapping("/sort/name/desc")
    public List<Product> findAllProductsByOrderByNameDesc() {
        return productService.findAllProductsByOrderByNameDesc();
    }

    @GetMapping("/sort/price/asc")
    public List<Product> findAllProductsByOrderByPriceAsc() {
        return productService.findAllProductsByOrderByPriceAsc();
    }

    @GetMapping("/sort/price/desc")
    public List<Product> findAllProductsByOrderByPriceDesc() {
        return productService.findAllProductsByOrderByPriceDesc();
    }
}
