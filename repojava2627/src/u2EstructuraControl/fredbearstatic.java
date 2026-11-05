package u2EstructuraControl;
public class fredbearstatic {

    // Método que evalúa qué pasa según el estado de los animatrónicos y la opción del usuario
    public static String evaluarAccion(boolean fredbear, boolean nightmare, int opcionUsuario) {
        if (fredbear && nightmare && opcionUsuario == 1) {
            return "JUMPSCARE_NIGHTMARE"; // Defendiste puerta pero te cazó el armario
        } 
        else if (fredbear && nightmare && opcionUsuario == 2) {
            return "JUMPSCARE_FREDBEAR"; // Espantaste armario pero entró Fredbear
        } 
        else if (fredbear && opcionUsuario == 1) {
            return "FREDBEAR_HUYE";
        } 
        else if (nightmare && opcionUsuario == 2) {
            return "NIGHTMARE_HUYE";
        } 
        else if ((fredbear || nightmare) && opcionUsuario == 3) {
            return "JUMPSCARE_ESPERAR";
        } 
        else if (fredbear && nightmare && opcionUsuario == 5) {
            return "TRAMPA_EXITOSA";
        } 
        else if (opcionUsuario == 4) {
            return "SALIDA";
        } 
        else {
            return "TODO_TRANQUI";
        }
    }
    
    // El método main iría aquí abajo llamando a este método...
}