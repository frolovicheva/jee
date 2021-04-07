package com.geekbrains.app;

import java.util.Objects;

public class Product {
    private int id;
    private String title;
    private float cost;

    public Product(int id, String title, float cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "id " + id + ", product: " + title + ", cost " + cost + " RUB/KG";
    }

    @Override
    public int hashCode() {
        return Objects.hash (getId (), getTitle (), getCost ());
    }
}
