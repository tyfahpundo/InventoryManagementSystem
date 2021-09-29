package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetailsResponse {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private int mobileNumber;
    private String email;
    private Date dob;
}
