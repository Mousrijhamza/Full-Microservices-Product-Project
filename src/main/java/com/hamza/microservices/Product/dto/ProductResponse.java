package com.hamza.microservices.Product.dto;

import java.math.BigDecimal;

public record ProductResponse(
        String Id, String Name, String Description, BigDecimal price
) {
}
