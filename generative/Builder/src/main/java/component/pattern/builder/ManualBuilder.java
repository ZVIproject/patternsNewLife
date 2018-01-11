package component.pattern.builder;

import component.entity.Game;
import component.entity.Manual;
import component.enums.GameType;
import component.interfacee.Builder;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class ManualBuilder implements Builder {


    private String name;

    private GameType gameType;

    private Double cost;

    private int popularityLevel;

    public void setName(String name) {
        this.name = name;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setPopularityLevel(int popularityLevel) {
        this.popularityLevel = popularityLevel;
    }

    public Manual getResult() {
        return new Manual(name, gameType, cost, popularityLevel);
    }
}
