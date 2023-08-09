package com.epam.blockchainpoc.client.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Network {
    private String address;
    private int amount;
}
