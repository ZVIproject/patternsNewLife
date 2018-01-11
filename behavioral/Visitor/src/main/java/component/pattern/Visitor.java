package component.pattern;

import component.interfacee.Human;
import component.service.*;

/**
 * Created by vladzarovnyi on 11/22/17.
 */
public class Visitor {

    public Food visitAmerican(American american) {
        return new Food(american.getName(), american.getFoodPrice(), false);
    }

    public Food visitGerman(German german) {
        return new Food("German", german.getTotalPrice(), (german.getAge() > 40));
    }

    public Food visitUkrainian(Ukrainian ukrainian) {
        return new Food(ukrainian.getName(), ukrainian.getTotalPrice(), true);
    }

    public Food visitCanadian(Canadian canadian) {
        return new Food(canadian.getName(), canadian.getFoodPrice(), false);
    }

    public String doDinner (Human... humens) {
        StringBuilder dinnerInfo = new StringBuilder();

        dinnerInfo.append("Dinner on ");
        dinnerInfo.append(humens.length);
        dinnerInfo.append("\n\n");

        for (Human human : humens) {
            dinnerInfo.append(human.accept(this));
            dinnerInfo.append("\n\n");
        }

        dinnerInfo.append("\nHave a nice dinner!!!");

        return dinnerInfo.toString();
    }
}
