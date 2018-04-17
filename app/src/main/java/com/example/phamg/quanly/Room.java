package com.example.phamg.quanly;

/**
 * Created by phamg on 9/18/2017.
 */

public class Room {
    private String id;
    private double price;
    private String type;
    private String status;

    public Room() {
    }

    public Room(String id, double price, String type, String status) {
        this.id = id;
        this.price = price;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getStatus() { return status; }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
