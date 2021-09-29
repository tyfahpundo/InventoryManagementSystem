package zw.co.afrosoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockTake {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long stockTakeId;
    private Date date;
    private LocalTime startTime;
    private LocalTime endTime;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
}
