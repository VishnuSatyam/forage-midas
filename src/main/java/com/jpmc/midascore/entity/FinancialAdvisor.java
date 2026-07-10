package com.jpmc.midascore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    protected FinancialAdvisor() {
    }

    public FinancialAdvisor(String name, String email, List<Client> clients) {
        this.name = name;
        this.email = email;
        this.clients = clients;
    }

    @Override
    public String toString() {
        return String.format("FinancialAdvisor[id=%d, name='%s', email='%s']", id, name, email);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
