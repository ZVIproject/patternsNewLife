package standalone;

import component.interfacee.Man;
import component.interfacee.Woman;
import component.pattern.Factory;

/**
 * Created by vladzarovnyi on 11/27/17.
 */
public class CreateFamily {

    private Man man;

    private Woman woman;

    private CreateFamily(Factory factory) {
        this.man = factory.createMan();
        this.woman = factory.createWoman();
    }

    public static CreateFamily createByFactory(Factory factory){
        return new CreateFamily(factory);
    }

    public void createFamilyLife(){
        createManLife();
        createWomanLife();
    }

    private void createManLife() {
        man.eatFood();
        man.goToTheToilet();
    }

    private void createWomanLife() {
        woman.doDinner();
        woman.doShopping();
    }
}
