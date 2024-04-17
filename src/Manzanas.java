
import javax.swing.JOptionPane;

public class Manzanas {

    public static void main(String[] args) {
      String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de kilos de manzanas ");
      double kilos = Double.parseDouble(input);
      double total = kilos * 4200;
      double descuento = 0;
      
      if (kilos > 0 && kilos <= 2){
          descuento = 0;
      }else if (kilos > 2 && kilos <= 5){
          descuento = 0.1;
      }else if (kilos > 5 && kilos <= 10){
          descuento =0.15;
      }else if (kilos > 10){
          descuento = 0.20;
      }
       
      double precioDescuento = total-(total*descuento);
      
      JOptionPane.showMessageDialog(null, "Cantidad de kilos  : " + kilos +
              "\n Precio sin descuento : " + total +
              "\n Con descuento : " + (descuento*100)+ "%"+
              "\n Precio Total Con Descuento :  "+ precioDescuento);
      
      JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR NUESTRO SISTEMA");
      
              }
   
    
 
}
