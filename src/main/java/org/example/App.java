package org.example;

import org.example.entity.Transport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        task2();
        task3();
        task4();
    }

    public static void task2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Transport bus = context.getBean("bus", Transport.class);
        bus.setRoutNumber(17);
        Transport taxi = context.getBean("taxi", Transport.class);
        taxi.setRoutNumber(0);
        Transport subway = context.getBean("subway", Transport.class);
        subway.setRoutNumber(3);

        System.out.println(bus);
        System.out.println(taxi);
        System.out.println(subway + "\n");
    }

    public static void task3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Transport bus = context.getBean("bus", Transport.class);
        bus.setRoutNumber(1);
        Transport taxi = context.getBean("taxi", Transport.class);
        taxi.setRoutNumber(0);
        Transport subway = context.getBean("subway", Transport.class);
        subway.setRoutNumber(2);

        System.out.println(bus);
        System.out.println(taxi);
        System.out.println(subway + "\n");
    }

    public static void task4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        HashMap<Integer, Transport> transportMap = context.getBean("transportMap", HashMap.class);
        transportMap.forEach((App::setKeyAsRout));
        transportMap.entrySet().forEach(System.out::println);

    }

    private static void setKeyAsRout(Integer key, Transport transport) {
        transport.setRoutNumber(key);
    }
}
