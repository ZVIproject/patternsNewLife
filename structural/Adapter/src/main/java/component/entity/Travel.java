package component.entity;

/**
 * Created by vladzarovnyi on 12/1/17.
 */
public class Travel {


    private double cost = 10.2;

    public double travelCost(Place place) {
        return this.cost * place.getWidth();
    }

}
