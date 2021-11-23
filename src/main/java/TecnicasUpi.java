
import javax.swing.JOptionPane;

public class TecnicasUpi {
    public void cuadrado() {
            int lado,area;
            lado=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del lado"));
            area=lado*lado;
            JOptionPane.showInputDialog(null,"El area del cuadrado es:  "+ area);
}
    public void triangulo() {
        int base,altura,area;
        base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
        altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura"));
        area=(base*altura)/2;
        JOptionPane.showInputDialog(null,"El area del triangulo es:  "+ area);
    }
     public void circulo(){
         double radio, pi = 3.1416, area;
         radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
         area=pi*Math.pow(radio,2);
         JOptionPane.showInputDialog(null,"El area del circulo es:  "+ area);
     }
    
}
