package com.jpmc.midascore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String ticker;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float price;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    protected Security() {
    }

    public Security(String ticker, int quantity, float price, Portfolio portfolio) {
        this.ticker = ticker;
        this.quantity = quantity;
        this.price = price;
        this.portfolio = portfolio;
    }

    @Override
    public String toString() {
        return String.format("Security[id=%d, ticker='%s', qty=%d, price=%f]", id, ticker, quantity, price);
    }

    public Long getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
