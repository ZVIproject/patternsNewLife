package component.entity;

import component.enums.GameType;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class Game {

    private String name;

    private GameType gameType;

    private Double cost;

    private int popularityLevel;

    public Game(String name, GameType gameType, Double cost, int popularityLevel) {
        this.name = name;
        this.gameType = gameType;
        this.cost = cost;
        this.popularityLevel = popularityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getPopularityLevel() {
        return popularityLevel;
    }

    public void setPopularityLevel(int popularityLevel) {
        this.popularityLevel = popularityLevel;
    }
}
