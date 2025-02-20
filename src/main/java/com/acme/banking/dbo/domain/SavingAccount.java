package com.acme.banking.dbo.domain;

import java.util.UUID;

public class SavingAccount implements Account {
    private UUID id;
    private Client client;
    private double amount;

    public SavingAccount(UUID id, Client client, double amount) {
        if(id == null) throw new IllegalArgumentException("null id");
        if(client == null) throw new IllegalArgumentException("null client");
        this.id = id;
        this.client = client;
        this.amount = amount;
        client.addAccount(this);
    }

    public SavingAccount(UUID id, double amount) {
        if(id == null) throw new IllegalArgumentException("null id");
        this.id = id;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public UUID getClientId() {
        return client.getId();
    }
}
