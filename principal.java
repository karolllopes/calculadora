import javax.swing.*;
public class principal {
    public static void main(String args[]) {
        CalculadoraBasica CB = new CalculadoraBasica();
        double a = 0, b = 0;
        int opções;
        do {
            opções = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1- somar " + 
                    "\n2- subtrair \n3- multiplicar \n4- dividir \n0- sair "));
            switch (opções) {
                case 1:
                    CB.somar(); 
                    break;
                    
                case 2:
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    CB.subtrair(a, b);
                    break;
                    
                case 3:
                    double r = CB.multiplicar();
                    JOptionPane.showMessageDialog(null,"O resultado da multiplicacao é: " +r);
                    break; 
                    
                case 4:           
                    a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
                    b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
                    double r1 = CB.dividir(a, b);  
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa!");
                    break ;
                    
                default: 
                    JOptionPane.showMessageDialog(null, "Opção invalida!");   
                    
            }
        }while (opções != 0);
}
        }

