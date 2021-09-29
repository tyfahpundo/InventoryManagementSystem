package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zw.co.afrosoft.domain.Category;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsRequest {
    @NotBlank(message = "Name cannot be null")
    @Size(min = 2, max = 100, message = "Name Characters must be between 2 and 100")
    private String name;
    @NotBlank(message = "Description cannot be null")
    @Size(min = 2, max = 500, message = "Description Characters must be between 2 and 500")
    private String description;
    @NotBlank(message = "Purchase price cannot be null")
    private double purchasePrice;
    @NotBlank(message = "Selling price cannot be null")
    private double sellingPrice;
    @NotBlank(message = "Quantity in Hand cannot be null")
    private int quantityOnHand;
    @NotBlank(message = "Category must be provided!")
    private Category category;
}
