
package tallercolores;

public class TallerColores {

    
    public static void main(String[] args) {
        Reloj r1 = new Reloj("Casio", "Digital", 10, 30, true);
        Computador c1 = new Computador("HP", "Intel i5", 16, 512, false);
        Computador c2 = new Computador("Lenovo", "Ryzen 5", 16, 1024, true);

        
          System.out.println(r1.getMarca());
          System.out.println(c1.getProcesador());
          System.out.println(c2.getRam());
}
        
    }
    

