package com.vandan.paymentsApp.services;

import com.mongodb.client.MongoClients;
import com.vandan.paymentsApp.constants.AppConfigConstants;
import com.vandan.paymentsApp.constants.DefaultLimitsConstants;
import com.vandan.paymentsApp.constants.OfferConstants;
import com.vandan.paymentsApp.models.NewUser;
import com.vandan.paymentsApp.models.User;
import com.vandan.paymentsApp.models.db.Offer;
import com.vandan.paymentsApp.models.db.Wallet;
import com.vandan.paymentsApp.repository.OfferRepository;
import com.vandan.paymentsApp.repository.UserRepository;
import com.vandan.paymentsApp.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

@Service("UserService")
public class UserService{

    @Autowired
    private UserRepository userDB;

    @Autowired
    private OfferRepository offerDB;

    @Autowired
    private WalletRepository walletDB;

    private MongoOperations mongoOps = new MongoTemplate(new SimpleMongoClientDbFactory(MongoClients.create(), AppConfigConstants.DB_NAME.getValue()));

    public ResponseEntity<User> createNewUser(NewUser newUser){
        float initialBalance = 0;
        Optional<User> userCheck = Optional.ofNullable(userDB.findByPhoneNumber(newUser.getPhoneNumber()));
        if(userCheck.isPresent()){
            User user = new User(newUser.getPhoneNumber(), newUser.getName(), "Exists");
            return new ResponseEntity<User>(user, HttpStatus.LOCKED);
        }
        else {
            User userNew = new User(newUser.getPhoneNumber(), newUser.getName(), "pending");
            Optional<Offer> offerObjOptional = Optional.ofNullable(offerDB.findByPromoCode(newUser.getPromoCode()));
            if (offerObjOptional.isPresent()) {
                Offer offerObj = offerObjOptional.get();
                initialBalance = offerObj.getDiscountCategory().equals(OfferConstants.SIGNUP.getValue()) ? offerObj.getDiscount() : 0;
                initialBalance = Math.max(offerObj.getMaxDiscount(), initialBalance);
            }
            userDB.save(userNew);
            User user = userDB.findByPhoneNumber(newUser.getPhoneNumber());
            Wallet wallet = new Wallet(user.getId(), initialBalance, DefaultLimitsConstants.BALANCE.getValue(),
                    DefaultLimitsConstants.TRANSACTION.getValue());
            //WalletService.createWallet(wallet);
            walletDB.save(wallet);
            mongoOps.updateFirst(query(where("phoneNumber").is(user.getPhoneNumber())), update("walletID", wallet.getWalletID()), User.class);
            user = userDB.findByPhoneNumber(newUser.getPhoneNumber());
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
    }
}