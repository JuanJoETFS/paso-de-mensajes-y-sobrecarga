public class coche{
    private String color;
    private int velocidad;
    private float tamaño;
    private Rueda[] ruedas;
    private Motor motor;

    public coche (String color,int velocidad,
    float tamaño, Rueda[] ruedas, Motor motor ){
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
        this.ruedas = ruedas;
        this.motor = motor;
    }
    public void avanzar(){
        motor.inyectarCarburante();
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i].verificarPresion();
            ruedas[i].girar();
        }
    }
    public void avanzar(int metros){
        System.out.println("Avanzando " + metros + " metros");
        avanzar();
    }
    public void avanzar(int metros, int velocidad){
        System.out.println("Avanzando " + metros + " metros a " + velocidad + " km/h");
        avanzar();
    }
    public static void main(String[] args){

        Rueda[] ruedas = {new Rueda(20,"Dunlop", 2.8),
        new Rueda(20,"Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8)};
        coche miCoche = new coche("verde", 80, 3.2f, ruedas, new Motor("diesel", 500));
    }
}