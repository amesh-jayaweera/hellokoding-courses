package com.hellokoding.stripe.service;

import com.hellokoding.stripe.model.ChargeRequest;
import com.stripe.exception.*;
import com.stripe.model.Charge;

public interface StripeService {
    Charge charge(ChargeRequest chargeRequest)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException;
}
