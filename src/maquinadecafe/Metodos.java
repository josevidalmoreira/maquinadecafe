
package maquinadecafe;

import javax.swing.JOptionPane;


public class Metodos {
   Bebidas b = new Bebidas("cafe",0.5f);
   Azucar a = new Azucar(0);
   
   public void mostrarMenu(){
       System.out.println("1=CAFE, 2=CHOCOLATE , 3=TÉ , 4=CAFE CON LECHE , 5=CAFE DESCAFEINADO");
       
   }
   
   public void seleccionarBebida(){
       int x=0;
       
       switch(x){
           case 1:JOptionPane.showInputDialog("cafe 0.75 euros, introduzca importe");
           break;
            case 2:JOptionPane.showInputDialog("chocolate 0.5 euros, introduzca importe");
           break;
            case 3:JOptionPane.showInputDialog("Té 1 euros, introduzca importe");
           break;
            case 4:JOptionPane.showInputDialog("cafe con leche 1 euros, introduzca importe");
           break;
            case 5:JOptionPane.showInputDialog("cafe descafeinado 0.80 euros, introduzca importe");
           break;
           
       }
   }
}
