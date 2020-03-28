package com.vandan.paymentsApp.repository;

import com.vandan.paymentsApp.entity.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfferRepository extends MongoRepository<Offer, String> {

    public Offer findByPromoCode(String promoCode);
}
