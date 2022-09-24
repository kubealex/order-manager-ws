package org.acme.openapi.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    public Order() {
    }

    public Order(String order_id, Float order_price, Boolean order_paid_flag){
        this.order_id = order_id;
        this.order_price = order_price;
        this.order_paid_flag = false;
    }

    @JsonProperty("order_paid")
    private Boolean order_paid_flag;

    @JsonProperty("order_price")
    @Positive(message="Price should be a positive value")
    private Float order_price;

    @JsonProperty("order_id")
    @NotBlank(message="ID of the order cannot be negative")
    private String order_id; 

    public Float getPrice() {
        return order_total;
    }
    public void setPrice(Float order_total) {
        this.order_total = order_total;
    }
    public String getId() {
        return order_id;
    }
    public void setId(String order_id) {
        this.order_id = order_id;
    }

    public Boolean getStatus() {
        return order_paid_flag;
    }

    public void setStatus(Boolean order_paid_flag) {
        this.order_paid_flag;
    }
}
