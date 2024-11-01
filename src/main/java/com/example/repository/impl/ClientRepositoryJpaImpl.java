package com.example.repository.impl;

import com.example.entities.Client;
import com.example.repository.IClientRepository;

public class ClientRepositoryJpaImpl extends RepositoryJpaImpl<Client> implements IClientRepository{
    
    public ClientRepositoryJpaImpl() {
        super(Client.class);
        this.table = "clients";
    }
}
