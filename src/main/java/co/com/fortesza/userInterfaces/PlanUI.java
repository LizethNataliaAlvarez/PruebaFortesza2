package co.com.fortesza.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PlanUI {

    public static final Target BTNPAGO = Target.the("boton pago plan").
            locatedBy("(//ion-button[@class='btn-submit dd-ion-button ion-color ion-color-primary md button button-block button-solid ion-activatable ion-focusable hydrated'])[2]");

    //public static final Target BTNSCROLL1 = Target.the("boton para hacer scroll").
      //      locatedBy("//*[@id=\"main-content\"]/app-tabs/ion-tabs/div/ion-router-outlet/app-membership/ion-content/div/div/div/div[4]/ion-card/label/ion-card-content[3]");
}
