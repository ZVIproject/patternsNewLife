package component.pattern.builder;

import component.enums.GameType;
import component.interfacee.Builder;
import component.pattern.fabrica.Fabrica;
import component.pattern.fabrica.PersonalComputerFabrica;

/**
 * Created by vladzarovnyi on 11/28/17.
 */
public class Director {


    public Builder createGoodGame(Builder builder, Fabrica fabrica) {
        builder.setCost(322000D);
        builder.setGameType(GameType.PUBLIC);
        builder.setPopularityLevel(100);
        builder.setName("The best game!");

        fabrica.startPlatform();

        return builder;
    }

    public Builder createBadGame(Builder builder, Fabrica fabrica) {
        builder.setGameType(GameType.PRIVATE);
        builder.setPopularityLevel(10);
        builder.setName("HLRH 654");
        fabrica.startPlatform();

        return builder;
    }
}

