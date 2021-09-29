package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.StockTake;

public interface StockTakeRepository extends JpaRepository<StockTake, Long> {
}
