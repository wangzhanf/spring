package vip.epss.domain;

import com.sun.source.doctree.SerialDataTree;

import java.io.Serializable;

public class Boss implements Serializable {
    private String name;
    private Car car;

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Boss(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Boss() {
    }
}
