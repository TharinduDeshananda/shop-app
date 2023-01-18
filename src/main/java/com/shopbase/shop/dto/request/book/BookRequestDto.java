package com.shopbase.shop.dto.request.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
    private String name;
    private long pages;
    private BigDecimal price;
}
