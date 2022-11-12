package org.example.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class Transport {

    private String type;


    @Setter
    private int passengerCapacity;

    @Setter
    private int routNumber;

    public Transport(String type) {
        this.type = type;
    }

    public void setBusCapacity() {
        this.passengerCapacity = 40;
    }

    public void setTaxiCapacity() {
        this.passengerCapacity = 4;
    }

    public void setSubwayCapacity() {
        this.passengerCapacity = 200;
    }



}
