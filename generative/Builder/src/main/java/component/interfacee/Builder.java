package component.interfacee;

import component.enums.GameType;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public interface Builder {

    void setName(String name);

    void setGameType(GameType gameType);

    void setCost(Double cost);

    void setPopularityLevel(int popularityLevel);
}
