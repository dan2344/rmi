


public class RMIServerMain {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try 
        {
            RMIService ws = new RMIService();
           
            int suma = ws.getSuma(123, 10);
            int resta = ws.getResta(123,10);
            int Division = ws.getDivision(123,10);
            int multiplicacion = ws.getMultiplicacion(123,10);
            double raiz = ws.getRaiz(123,10);
            double potencia = ws.getPotencia(123,10);

            System.out.println("suma: " + suma + "resta" + resta+"multiplicacion" +multiplicacion +"division" +Division+"potencia"+potencia+"raiz"+raiz); 
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
            System.out.println("ERROR: " + ex);
        }
    }
}
