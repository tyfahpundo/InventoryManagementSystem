package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDetailsResponse {
    private Long categoryId;
    private String name;
    private String abbreviation;
}
