package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
