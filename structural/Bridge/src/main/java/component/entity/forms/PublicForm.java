package component.entity.forms;

import component.entity.solders.American;
import component.enums.FormType;
import component.interfaces.Form;
import component.interfaces.Solder;

/**
 * Created by vladzarovnyi on 12/7/17.
 */
public class PublicForm implements Form {

    private FormType capType;

    private FormType jacketType;

    public PublicForm(FormType capType, FormType jacketType) {
        this.capType = capType;
        this.jacketType = jacketType;
    }

    public void setCapType(FormType capType) {
            this.capType = capType;
    }

    public FormType getCapType() {
        return capType;
    }

    public void setJacketType(FormType jacketType) {
            this.jacketType = jacketType;
    }

    public void createStatus(Solder solder) {
            if (solder instanceof American){
                System.out.println("American boy!");
            }else {
                System.out.println("Український хлопчина!");
            }
    }
}
