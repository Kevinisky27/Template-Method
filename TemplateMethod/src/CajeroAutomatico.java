public class CajeroAutomatico extends CuentaBancaria{

    // Su constructor
    public CajeroAutomatico(String cuenta, int i, int t){
        procesar(cuenta, i, t);
    }

    @Override
    public void saludar() {
        System.out.println("     Por favor Ingrese los datos: ");
    }
}
