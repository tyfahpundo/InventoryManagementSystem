package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDetailsRequest {
    @NotBlank(message = "Name Should not be Blank")
    @Size(max = 100, message = "Name Should not have more than 100 Characters")
    private String name;
    @NotBlank(message = "abbreviation Should not be Blank")
    @Size(max = 10, message = "Abbreviation should not have more than 10 Characters")
    private String abbreviation;


}
