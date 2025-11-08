public class Motor {
   
    private String tipo;
    private int caballos;
 
    public Motor(String tipo, int caballos) {
        this.tipo = tipo;
        this.caballos = caballos;
    }
    public void inyectarCarburante(){
        if (caballos >= 500){
            System.out.println("Inyectando gran cantidad de carburante.");
        } else {
            System.out.println("Inyectando poca cantidad de carburante.");
        }
    }
}

