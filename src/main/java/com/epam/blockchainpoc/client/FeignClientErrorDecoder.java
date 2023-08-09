package com.epam.blockchainpoc.client;

import feign.Response;
import feign.codec.ErrorDecoder;

import static feign.FeignException.errorStatus;

public class FeignClientErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        return errorStatus(methodKey, response);
    }
}
