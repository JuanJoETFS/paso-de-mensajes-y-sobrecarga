public class clasep1 {
    public static void main(String[] args) {
        Rueda[] ruedas = {new Rueda(20,"Dunlop", 2.8),
        new Rueda(20,"Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8)};
        coche miCoche = new coche("verde", 80, 3.2f, ruedas, new Motor("diesel", 600));

        miCoche.avanzar();
    }

    public void avanzar(){}
    public void avanzar (int metros){}
    public void avanzar (int metros, int velocidad){}

    public void parar(){}
    public void girarIzquierda(){}
    public void girarDerecha(){}
}
