package component.interfaces;

/**
 * Created by vladzarovnyi on 12/7/17.
 */
public interface Solder {

    void fire();

    boolean isAlive();

    void setAlive( boolean alive );

    String doAttack();

    void setAttack(String attackText);


}
