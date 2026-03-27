  
package tallercolores;

public class Computador {
    
    private String marca;
    private String procesador;
    private int Ram;
    private int almacenamiento;
    private boolean encendido;

    public Computador(String marca, String procesador, int Ram, int almacenamiento, boolean encendido) {
        this.marca = marca;
        this.procesador = procesador;
        this.Ram = Ram;
        this.almacenamiento = almacenamiento;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    public void encender() {
    encendido = true;
    }
 
    public void apagar() {
    encendido = false;
    }
 
    public void mostrarInfo() {
    System.out.println("PC: " + marca + " - " + procesador);
    }

    public void aumentarRam(int extra) {
    Ram += extra;
    }

    public void limpiarSistema() {
    System.out.println("Sistema limpiado");
    }
    
}
