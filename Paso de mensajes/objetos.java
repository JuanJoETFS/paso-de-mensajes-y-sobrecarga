public class objetos {
    public static void main(String[] args){
        Rueda[] ruedas = {new Rueda(20,"Dunlop", 2.8),
        new Rueda(20,"Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8),
        new Rueda(22, "Dunlop", 2.8)};
        coche miCoche = new coche("verde", 80, 3.2f, ruedas, new Motor("diesel", 600));
        coche tuCoche = new coche("rojo", 90, 3.5f, ruedas, new Motor("gasolina", 450));
        coche suCoche = new coche("azul", 100, 4.0f, ruedas, new Motor("diesel", 700));
        miCoche.avanzar();
        tuCoche.avanzar(100);
        suCoche.avanzar(200, 120);
    }
}

