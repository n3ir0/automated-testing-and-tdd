package com.acme.banking.dbo.domain;

import java.util.UUID;

public interface Account {
    UUID getId();

    UUID getClientId(); //TODO reference integrity
    void setClient(Client client);
    Client getClient();
}
