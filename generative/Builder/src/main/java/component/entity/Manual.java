package component.entity;

import component.enums.GameType;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class Manual {

    private String name;

    private GameType gameType;

    private Double cost;

    private int popularityLevel;

    public Manual(String name, GameType gameType, Double cost, int popularityLevel) {
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

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        StringBuilder manualDescription= new StringBuilder("Manual for the game. \n");

        manualDescription.append("\nName: " + name);
        manualDescription.append("\nCost: "+cost);
        manualDescription.append("\nGame type: "+gameType);
        manualDescription.append("\nPopularity level: "+popularityLevel);

        return manualDescription.toString();
    }
}
