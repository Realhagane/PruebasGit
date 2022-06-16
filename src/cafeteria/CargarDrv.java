
package cafeteria;


public class CargarDrv {

    //La excepcion se manipular en el principal  
    public static void cargar(String drv) throws ClassNotFoundException {

        Class.forName(drv);
    }

}
