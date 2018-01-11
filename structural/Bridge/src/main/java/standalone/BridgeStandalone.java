package standalone;

import component.entity.forms.PublicForm;
import component.entity.solders.American;
import component.entity.solders.Ukrainian;
import component.enums.FormType;

/**
 * Created by vladzarovnyi on 12/6/17.
 */
public class BridgeStandalone {

    public static void main(String[] args) {
        PublicForm winterForm = new PublicForm(FormType.LONG, FormType.SHORT);

        PublicForm summerForm = new PublicForm(FormType.SHORT, FormType.SHORT);

        American american = new American(true, "Go-go-go", winterForm);
        american.fire();
        american.isAlive();

        Ukrainian ukrainian = new Ukrainian(true, "Вперед!", winterForm);
        ukrainian.fire();
        ukrainian.isAlive();

    }
}
