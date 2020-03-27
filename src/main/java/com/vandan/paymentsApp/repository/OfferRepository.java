package com.vandan.paymentsApp.repository;

import java.util.List;

import com.vandan.paymentsApp.models.User;
import com.vandan.paymentsApp.models.db.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OfferRepository extends MongoRepository<Offer, String> {

    public Offer findByPromoCode(String promoCode);
}
