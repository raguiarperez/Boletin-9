
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author rafa
 */
public class rectangulo {
    private float base;
    private float altura;
    
    public float calcularArea(){
        boolean correcto = false;
        do{
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Base de rectangulo:"));
        if(num1 > 0){
            base = num1;
            correcto = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Numero no correcto");
        }
        }while(correcto == false);
        correcto = false;
        do{
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Altura de rectangulo"));
        if(num2 > 0){
            altura = num2;
            correcto = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Numero no correcto");
        }
        }while(correcto == false);
        return base * altura;
    }
}
