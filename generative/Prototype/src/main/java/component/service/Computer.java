package component.service;

import java.util.HashMap;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public abstract class Computer {

    private boolean working;

    private String name;

    private Double price;

    public Computer() {
    }

    public Computer(Computer target) {

        if(target == null){
            return;
        }

        this.working = target.working;
        this.name = target.name;
        this.price = target.price;
    }

    public abstract Computer clone();

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Computer)) return false;

        Computer computer = (Computer) obj;

        return this.working == computer.working && this.name.equals(computer.name) && this.price.equals(computer.price);
    }
}
