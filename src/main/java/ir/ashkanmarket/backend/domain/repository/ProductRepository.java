package ir.ashkanmarket.backend.domain.repository;

import ir.ashkanmarket.backend.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

interface ProductRepository extends JpaRepository<Product,Long> {
}
