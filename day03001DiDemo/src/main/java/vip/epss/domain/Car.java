package vip.epss.domain;

import java.io.Serializable;

//pojo类
public class Car implements Serializable {
    private String brand;
    private Integer wheel;

    public Car() {
    }

    public Car(String brand, Integer wheel) {
        this.brand = brand;
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", wheel=" + wheel +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }
}
