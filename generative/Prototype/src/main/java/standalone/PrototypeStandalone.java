package standalone;

import component.entity.PersonalComputer;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public class PrototypeStandalone {

    public static void main(String[] args) {

        PersonalComputer personalComputer1 = new PersonalComputer();
        personalComputer1.setName("MDK32");
        personalComputer1.setPower(21);
        personalComputer1.setPrice(239.41);
        personalComputer1.setWorking(true);

        PersonalComputer personalComputer2 = personalComputer1.clone();

        System.out.println(personalComputer1.equals(personalComputer2));

    }
}
