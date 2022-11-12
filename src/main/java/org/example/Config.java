package org.example;


import org.example.entity.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Transport bus() {
        Transport bus = new Transport("bus");
        bus.setBusCapacity();
        return bus;
    }

    @Bean
    public Transport taxi() {
        Transport taxi = new Transport("taxi");
        taxi.setTaxiCapacity();
        return taxi;
    }

    @Bean
    public Transport subway() {
        Transport subway = new Transport("subway");
        subway.setSubwayCapacity();
        return subway;
    }


}
