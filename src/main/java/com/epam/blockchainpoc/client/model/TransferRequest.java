package com.epam.blockchainpoc.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class TransferRequest {
    private String currency;
    @JsonProperty("transfer-key")
    private String transferKey;
    private List<String> addresses;
    private List<Destination> destinations;
    private String fee;
    @JsonProperty("subtract-fee-from-amount")
    private boolean subtractFeeFromAmount;
    @JsonProperty("fee-rate")
    private Integer feeRate;
}
