package zw.co.afrosoft.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import zw.co.afrosoft.domain.Category;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsResponse {
    private Long productId;
    private String name;
    private String description;
    private double purchasePrice;
    private double sellingPrice;
    private int quantityOnHand;
    private Category category;
}
