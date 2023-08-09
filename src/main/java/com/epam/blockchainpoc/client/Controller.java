package com.epam.blockchainpoc.client;

import com.epam.blockchainpoc.client.model.AuthRequest;
import com.epam.blockchainpoc.client.model.AuthResponse;
import com.epam.blockchainpoc.client.model.TransferRequest;
import com.epam.blockchainpoc.client.model.TransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    ApironeClient apironeClient;

    @PostMapping("/transferViaAccount/{accountId}")
    public ResponseEntity<TransferResponse> transferCrypto(@PathVariable String accountId, @RequestBody TransferRequest transferRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();
        AuthRequest request = new AuthRequest(accountId, transferRequest.getTransferKey());
        AuthResponse authResponse = apironeClient.authorization(request);
        httpHeaders.add(HttpHeaders.AUTHORIZATION, authResponse.getAccessToken());
        return new ResponseEntity<>(apironeClient.transferViaAccountApi(httpHeaders, accountId, transferRequest), HttpStatus.OK);
    }
}