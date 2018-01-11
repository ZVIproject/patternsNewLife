package component.entity.solders;

import component.interfaces.Form;
import component.interfaces.Solder;

/**
 * Created by vladzarovnyi on 12/7/17.
 */
public class American implements Solder {


    private boolean alive;

    private String attackText;

    private Form form;


    public American(boolean alive, String attackText, Form form) {
        this.alive = alive;
        this.attackText = attackText;
        this.form = form;
    }

    public void fire() {
        System.out.println("Fire fire," + attackText + "I'm "+ (alive ? "alive" : "dead") + "\nI will be in the " + form.getCapType() );
    }

    public boolean isAlive() {
        form.createStatus(this);
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String doAttack() {
        return "Fellows! \n" + attackText;
    }

    public void setAttack(String attackText) {
        this.attackText = attackText;
    }
}
