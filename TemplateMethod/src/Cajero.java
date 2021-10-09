public class Cajero extends CuentaBancaria {

    // Su constructor
    public Cajero(String cuenta, int i, int t){
        procesar(cuenta, i, t);
    }

    @Override
    public void saludar() {
        System.out.println("Bienvenido a BANRURAL, en que le puedo ayudar?");
    }

    // Sobreescribiendo el metodo auditoria
    @Override
    public void auditoria(){
        // Llamamos el metodo auditoria de la clase padre
        super.auditoria();
        System.out.println("Con mucho gusto, vuelva pronto.");
    }

}
