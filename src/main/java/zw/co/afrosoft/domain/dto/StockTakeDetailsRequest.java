package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zw.co.afrosoft.domain.Employee;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockTakeDetailsRequest {
    @NotBlank(message = "Date Cannot be null")
    private Date date;
    @NotBlank(message = "Start time Cannot be null")
    private LocalTime startTime;
    @NotBlank(message = "End time Cannot be null")
    private LocalTime endTime;
    @NotBlank(message = "Employee Id Cannot be null")
    private Employee employee;
}
