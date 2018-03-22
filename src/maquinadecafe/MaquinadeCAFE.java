
package maquinadecafe;

import javax.swing.JOptionPane;


public class MaquinadeCAFE {
    public static void main(String[] args) {
        int x=0,a=0;
        float y=0,z=0,debolucion;
        
       
        x=Integer.parseInt(JOptionPane.showInputDialog("1=cafe, 2=chocolate, 3= té"));
        switch(x){
           
           case 1 :y=Float.parseFloat(JOptionPane.showInputDialog("0,5 euros,introduzca el pago")); z=0.5f;
           break;
           case 2 :y=Float.parseFloat(JOptionPane.showInputDialog("1 euros,introduzca el pago")); z=1;
           break;
           case 3 :y=Float.parseFloat(JOptionPane.showInputDialog("0,75 euros,introduzca el pago"));z=0.75f ;
           break;
       }
        a=Integer.parseInt(JOptionPane.showInputDialog("1=sin azucar, 2=poco azucar, 3= mucho azucar"));
        switch(a){
           
           case 1 :System.out.println("bebida sin azucar");
           break;
           case 2 :System.out.println("azucar moderado");
           break;
           case 3 :System.out.println("azucarado"); 
           break;
       }
          switch(x){
           
           case 1 :System.out.println("elaborando cafe");
           break;
           case 2 :System.out.println("elaborando chocolate");
           break;
           case 3 :System.out.println("elaborando té"); 
           break;
       }
        debolucion = y-z;
        System.out.println("su cambio es de  "+debolucion+" euros");
    }
    
}
