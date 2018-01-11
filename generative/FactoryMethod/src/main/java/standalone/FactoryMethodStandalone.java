package standalone;

import component.pattern.Dialog;
import component.pattern.HondaDialog;

/**
 * Created by vladzarovnyi on 11/24/17.
 */
public class FactoryMethodStandalone {

    private static Dialog dialog;

    public static void main(String[] args) {
        startStreetReacing();
    }

    private static void startStreetReacing() {

        dialog = new HondaDialog();
        dialog.doDriveTheCar();

    }
}
