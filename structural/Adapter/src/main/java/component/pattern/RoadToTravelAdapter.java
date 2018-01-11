package component.pattern;

import component.entity.Place;
import component.entity.Road;

/**
 * Created by vladzarovnyi on 12/1/17.
 */
public class RoadToTravelAdapter extends Place {

    private Road road;

    public RoadToTravelAdapter(Road road) {
        this.road = road;
    }

    @Override
    public double getWidth() {
        return road.getLength() * 1.6;
    }
}
