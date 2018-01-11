package standalone;

import component.pattern.AmericanFamily;
import component.pattern.Factory;
import component.pattern.UkrainianFamily;

/**
 * Created by vladzarovnyi on 11/27/17.
 */
public class AbstractFactoryStandalone {

    private static Factory factory;

    public static void main(String[] args) {

        CreateFamily.createByFactory(generateFactoryByNationality("merican")).createFamilyLife();
    }

    private static Factory generateFactoryByNationality(String nationality) {
        if (nationality.toLowerCase().equals("american")) {
            return new AmericanFamily();
        } else {
            return new UkrainianFamily();
        }
    }


}
