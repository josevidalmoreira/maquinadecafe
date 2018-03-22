
package maquinadecafe;


public class Azucar {
    int nivel;

    public Azucar(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Azucar{" + "nivel=" + nivel + '}';
    }
    
    
}
