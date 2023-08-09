package com.epam.blockchainpoc.client;

import com.epam.blockchainpoc.client.model.AuthRequest;
import com.epam.blockchainpoc.client.model.AuthResponse;
import com.epam.blockchainpoc.client.model.TransferRequest;
import com.epam.blockchainpoc.client.model.TransferResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "apironeClient", url = "https://apirone.com/api/v2/", configuration = FeignConfig.class)
public interface ApironeClient {

    @PostMapping("/accounts/{account}/transfer")
    public TransferResponse transferViaAccountApi(@RequestHeader(HttpHeaders.AUTHORIZATION) HttpHeaders auth, @PathVariable("account") String account, @RequestBody TransferRequest request);

    @PostMapping("/auth/login")
    public AuthResponse authorization(@RequestBody AuthRequest request);
}
