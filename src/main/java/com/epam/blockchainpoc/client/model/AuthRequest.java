package com.epam.blockchainpoc.client.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AuthRequest {
    private String login;
    private String password;
}
