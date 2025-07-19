package com.crcafe.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderItemDto {
    @NotNull(message = "Item ID cannot be null")
    private Long itemId;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;
}
