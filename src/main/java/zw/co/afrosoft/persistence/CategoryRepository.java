package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
