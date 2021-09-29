package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.StockTakeDetail;

public interface StockTakeDetailRepository extends JpaRepository<StockTakeDetail,Long> {
}
