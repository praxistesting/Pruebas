
package suma;

import javax.swing.JOptionPane;

public class Suma {

    public static void main(String[] args) {
        int a;
        int b;
        int result;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número"));
        result=a*b;
        
        JOptionPane.showMessageDialog(null, "El resultado es: "+ result);
    }
    
}