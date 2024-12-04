package com.example.Fashion_Shop.response.orders;

import com.example.Fashion_Shop.dto.SkuDTO.SkuDTO;
import com.example.Fashion_Shop.response.SKU.SkuResponse;
import com.example.Fashion_Shop.response.product.ProductResponse;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderdetailsResponse {
    private List<SkuResponse> skus;
    private Integer quantity;
    private Double price;
    private Double totalMoney;
    private String productName;


}
