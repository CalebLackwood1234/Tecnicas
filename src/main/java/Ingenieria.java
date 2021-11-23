
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ingenieria {
    DecimalFormat df=new DecimalFormat("#.00");
    double promedio,parcial1,parcial2,examenfinal;
    public void Programacion(){
        parcial1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        parcial2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final"));
        promedio=(parcial1+parcial2+examenfinal)/3;
        JOptionPane.showInputDialog(null,"El promedio es: "+promedio);
    }
    public void Calculo(){
        parcial1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        parcial2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final"));
        promedio=(parcial1+parcial2+examenfinal)/3;
        JOptionPane.showInputDialog(null,"El promedio es: "+promedio);
    }
    public void Ingles(){
        parcial1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        parcial2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final"));
        promedio=(parcial1+parcial2+examenfinal)/3;
        JOptionPane.showInputDialog(null,"El promedio es: "+promedio);
    }
        public void Algebra(){
        parcial1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        parcial2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen final"));
        promedio=(parcial1+parcial2+examenfinal)/3;
        JOptionPane.showInputDialog(null,"El promedio es: "+promedio);
}
public static void main(String[] args){
    Ingenieria notas=new Ingenieria();
    int menu;
    do
    {
        menu=Integer.parseInt(JOptionPane.showInputDialog("Digite el promedio segun corresponda"+"\n 1) Programacion "
                +"\n 2) Calculo "
                +"\n 3) Ingles "
                +"\n 4) Algebra "
                +"\n 0) Salir "));
        switch(menu) {
            case 1:
                notas.Programacion();
                break;
                 case 2:
                notas.Calculo();
                break;
                 case 3:
                notas.Ingles();
                break;
                 case 4:
                notas.Algebra();
                
    }
    }while (menu!=0);
}}



