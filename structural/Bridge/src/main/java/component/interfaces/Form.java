package component.interfaces;

import component.enums.FormType;

/**
 * Created by vladzarovnyi on 12/7/17.
 */
public interface Form {

    void setCapType(FormType capType);

    FormType getCapType();

    void setJacketType(FormType jacketType);

    void createStatus(Solder solder);
}
