package starter.page;

import net.serenitybdd.screenplay.targets.Target;

public class busquedaPricipalPage {
    public static Target CLAVE_USUARIO =  Target.the("ubica en logueo el usuario").locatedBy("//input[@id='user_login']");

    public static Target LLENA_CLAVE_USUARIO = Target.the("llena usuario").locatedBy("//input[@id='user_login']");

    public static Target UBICA_PASS_USUARIO = Target.the("ubica en logueo el pass").locatedBy("//input[@id='login_user_password']");

    public static Target LLENA_PASS_USUARIO = Target.the("llena pass").locatedBy("//input[@id='login_user_password']");

   public static Target UBICA_ASIGNADOS_PROPIOS = Target.the("boton asignados a mi").locatedBy("//span[@ux-id='assigned-grp-tkt']");

    public static Target ASIGNADOS_AL_GRUPO = Target.the("poner tickets asignados al grupo").locatedBy("//*[@id='main']/div/div[2]/div[1]/div/div/ul/li[2]/div/div/span");

    public static Target SELECCIONAR_CHECK = Target.the("").locatedBy("//input[@class='ngSelectionCheckbox']");
    //public static Target ASIGNADO_A_QUIEN = Target.the("campo tickets asignados").locatedBy("//div[@class='ngCellText ng-scope col6 colt6']");


}
