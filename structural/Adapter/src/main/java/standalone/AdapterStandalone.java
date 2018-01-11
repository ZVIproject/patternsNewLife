package standalone;

import component.entity.Place;
import component.entity.Road;
import component.entity.Travel;
import component.pattern.RoadToTravelAdapter;

/**
 * Created by vladzarovnyi on 12/1/17.
 */
public class AdapterStandalone {

    public static void main(String[] args) {
        Travel travel = new Travel();

        System.out.println(travel.travelCost(new Place(10)));

        System.out.println(travel.travelCost(new RoadToTravelAdapter(new Road(10))));
    }
}
