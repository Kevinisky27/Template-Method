public abstract class CuentaBancaria {
    // Creación de los Atributos de la Cuenta Bancaria
    private String cuenta;
    private int saldo = 0;

    // creación del metodo setCuenta, el cual recibe el número de la cuenta
    // Que se va a administrar
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    // Continuamos con el método consignar
    private void consignar(int i){
        // Informara que está ejecutando la operación de consignar
        System.out.println("   Consignando...");
        // aumentará el saldo de la cuenta
        this.saldo += i;
    }

    private void retirar(int i){
        System.out.println("   Retirando...");
        // Si lo que va a retirar es mejor que -10
        // Puede realizar el retiro
        if(i<=this.saldo-10){
            this.saldo -= i;
        } else {
            // De lo contrario saldra este mensaje, en donde no se puede realizar el retiro
            System.out.println("No se puede retirar ese monto.");
        }
    }

    // consulta de saldo
    private void consultarSaldo(){
        System.out.println("El saldo actual es de " + this.saldo);
    }

    // Auditoria
    protected void auditoria(){
        System.out.println("Se ha procesado la cuenta: " + this.cuenta);
    }

    protected abstract void saludar();

     public void procesar(String cuenta, int i, int t){
        saludar();
        setCuenta(cuenta);

        switch(t){
            case 1:
                consignar(i);
                break;

            case 2:
                retirar(i);
                break;

            default:
                System.out.println("Opción no valida");
        }

        consultarSaldo();
        auditoria();
    }
}
