package com.Jpa_Hybernate.Jpa_Hybernate.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Product_Table",
        uniqueConstraints = {
                @UniqueConstraint(name = "title_price_unique",columnNames = {"title_x","price"})
         },
        indexes = {
        @Index(name = "sku_index",columnList = "sku")
        }
)
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String sku;
    @Column(name = "title_x")
    private String title;
    private BigDecimal price;
    private Integer quantity;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;


}
