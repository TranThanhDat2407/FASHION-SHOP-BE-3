package com.example.Fashion_Shop.dto;
import com.example.Fashion_Shop.dto.SkuDTO.SkuDTO;
import com.example.Fashion_Shop.model.SKU;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailDTO {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("sku")
    private SkuDTO skuDTO;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("totalMoney")
    private Double totalMoney;

}
