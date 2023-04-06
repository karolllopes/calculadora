
import javax.swing.JOptionPane;

public class CalculadoraBasica {
    //atributo
    private double n1;
    private double n2;
    private double r;
    
    // contrutores
    // inicializando o atributo zerado
    public CalculadoraBasica() {
        this(0,0,0);
    }
    public CalculadoraBasica(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getR() {
        return r;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar() {
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
        this.setR (this.getN1 () + this.getN2());
        JOptionPane.showMessageDialog(null,"O resultado da soma é: " + this.getR());
    }
    public void subtrair (double a1,double b1) { 
    
    this.setN1(a1);
    this.setN2(b1);
    this.setR (this.getN1 () - this.getN2 ());
    JOptionPane.showMessageDialog(null,"O resultado da subtração é: " + this.getR());
}
    public double multiplicar () {
        this.setN1 (Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: ")));
        this.setN2 (Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: ")));
      this.setR (this.getN1 () * this.getN2());
      return this.r;
    }
    public double dividir(double a1, double b1){
       this.setN1(a1);
       this.setN2(b1);
       this.setR (this.getN1 () / this.getN2 ());
       JOptionPane.showMessageDialog(null,"O resultado da divisão é: " + this.getR());
       return this.getR();
    }
}
