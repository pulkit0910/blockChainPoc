package com.epam.blockchainpoc.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Fee {
    @JsonProperty("subtract-from-amount")
    private boolean subtractFromAmount;
    private Network network;
}
