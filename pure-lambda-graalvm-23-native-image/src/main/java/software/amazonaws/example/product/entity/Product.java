package software.amazonaws.example.product.entity;


import java.math.BigDecimal;

public record Product(String id, String name, BigDecimal price) {
}
