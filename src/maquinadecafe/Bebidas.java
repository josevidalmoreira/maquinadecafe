
package maquinadecafe;


public class Bebidas {
    String nome;
    float precio;

    public Bebidas(String nome, float precio) {
        this.nome = nome;
        this.precio = precio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "nome=" + nome + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
