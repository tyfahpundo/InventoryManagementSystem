package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetailsRequest {
    @NotBlank(message = "Firstname cannot be null")
    @Size(min = 2, max = 100,message = "firstname should not have characters between 2 than 100")
    private String firstName;
    @NotBlank(message = "Lastname cannot be null")
    @Size(max = 100, message = "Lastname should not have characters more than 100")
    private String lastName;
    @NotBlank(message = "Mobile number cannot be null")
    @Size(min = 2, max = 10,message = "Phone number should be between 2 and 10 digits")
    private int mobileNumber;
    @NotBlank(message = "Email should not be null")
    @Email
    @Size(max = 100, message = "email should not have characters more than 100")
    private String email;
    @NotBlank(message = "Date of birth should not be null")
    private Date dob;
}
