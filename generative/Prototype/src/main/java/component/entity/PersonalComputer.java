package component.entity;

import component.service.Computer;

import java.util.HashMap;

/**
 * Created by vladzarovnyi on 11/29/17.
 */
public class PersonalComputer extends Computer{

    private int power;

    public PersonalComputer(){
    }

    public PersonalComputer(PersonalComputer target) {
        super(target);
        this.power = target.power;
    }

    public PersonalComputer clone() {
        return new PersonalComputer(this);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof PersonalComputer) || !(super.equals(obj))){
            return false;
        }

        PersonalComputer personalComputerForChecking = (PersonalComputer) obj;
        return this.power == personalComputerForChecking.power;
    }
}
