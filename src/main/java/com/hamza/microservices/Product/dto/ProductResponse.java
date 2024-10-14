package com.hamza.microservices.Product.dto;

import java.math.BigDecimal;

public record ProductResponse(
        String productId, String productName, String productDescription, BigDecimal price
) {
}
