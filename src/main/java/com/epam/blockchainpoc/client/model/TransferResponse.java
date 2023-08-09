package com.epam.blockchainpoc.client.model;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TransferResponse {
    private String account;
    private String currency;
    private Date created;
    private String type;
    private String id;
    private List<String> txs;
    private List<Destination> destinations;
    private int amount;
    private int total;
    private Fee fee;
    private String changeAddress;
}
