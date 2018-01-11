package component.entity;

import component.service.Computer;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public class Laptop extends Computer {

    private Double weight;

    private Double height;


    public Laptop(Laptop target) {
        super(target);

        if (target == null){
            return;
        }
        this.weight = target.weight;
        this.height = target.height;
    }

    public Computer clone() {
        return new Laptop(this);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
