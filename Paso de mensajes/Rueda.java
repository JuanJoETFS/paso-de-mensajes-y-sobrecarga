public class Rueda {

    private double diametro;
    private String fabricante;
    private double presion;
 
    public Rueda  (double diametro, String fabricante, double presion){
        this.diametro = diametro;
        this.fabricante = fabricante;
        this.presion = presion;
    }
 
    public void girar(){
      if (diametro > 21){
        System.out.println("La rueda esta girando correctamente y " + "el diametro es de:  " + diametro);
        } else {
            System.out.println("la rueda  esta girando correctamente y " + "el diametro es de: " + diametro);
      }
    }

    public void verificarPresion(){
        if (presion < 2.5){
            System.out.println("Presion baja, se recomienda inflar la rueda.");
        } else if (presion > 3.0){
            System.out.println("Presion alta, se recomienda desinflar la rueda.");
        } else {
            System.out.println("Presion correcta.");
        }
    }
 
}
 