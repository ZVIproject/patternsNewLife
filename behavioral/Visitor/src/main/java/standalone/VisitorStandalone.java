package standalone;

import component.pattern.Visitor;
import component.service.American;
import component.service.Canadian;
import component.service.German;
import component.service.Ukrainian;

/**
 *
 */
public class VisitorStandalone {

    public static void main(String[] args) {

        System.out.println(new Visitor().doDinner(
                new American("AmericanDjo", 10D), new American("AmericanBriff", 15D),
                new Ukrainian("UkrainianVlad", 10D, false),
                new Canadian("CanadianJek", 1D),
                new German(30, 10D), new German(50, 10D)));
    }
}