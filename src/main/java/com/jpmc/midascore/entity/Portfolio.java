package com.jpmc.midascore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    @OneToOne(mappedBy = "portfolio")
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(String name, List<Security> securities) {
        this.name = name;
        this.securities = securities;
    }

    @Override
    public String toString() {
        return String.format("Portfolio[id=%d, name='%s']", id, name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
