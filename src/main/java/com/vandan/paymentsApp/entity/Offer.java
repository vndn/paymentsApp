package com.vandan.paymentsApp.models.db;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Offer {
    @Id
    private String offerID;
    private String promoCode;
    private String discountType;
    private float discount;
    private float maxDiscount;
    private String discountCategory;
    public Offer() {}

    public Offer(String promodcode, float discount, String discountType) {
        this.promoCode = promodcode;
        this.discount = discount;
        this.discountType = discountType;
    }

}