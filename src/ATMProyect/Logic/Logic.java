package ATMProyect.Logic;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Antonio
 */
public class Logic {
    
    public static double moneyActual;

    public Logic() {
        moneyActual = 0;
    }
    
    public static double getMoneyActual() {
        return moneyActual;
    }

    public static void setMoneyActual(double moneyActual) {
        Logic.moneyActual = moneyActual;
    }
    
    public void deposit(double deposit){
        moneyActual += deposit;
    }
    
    public void extrac(double retire){
        if (moneyActual >= retire) {
            moneyActual -= retire;
        }else{
            JOptionPane.showMessageDialog(null, "[Error] -Saldo Insuficiente-");
        }
    }
    
    public double obtainMoney(){
        return moneyActual;
    }
}
