public class PruebaPlantilla {
    public static void main(String[] args){
        //Cajero automatico, donde le debemos de pasar los 3 parametros
        //CajeroAutomatico cajeroAu1 = new CajeroAutomatico("7828101", 30, 1);
        //System.out.println();
        //Realizando un retiro de la cuenta 7828101
        //cajeroAu1.procesar("7828101", 10, 2);

        // Verificación si se realiza los procesos pero desde un cajero normal
        Cajero cajero1 = new Cajero("4595781", 110, 1);
        //System.out.println();
        // Realizando un retiro a la cuenta 4595781
        cajero1.procesar("4595781", 50, 2);
    }
}
