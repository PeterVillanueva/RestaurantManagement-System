/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peterdonniel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Peter
 */
public class SuperClass {

    public double ButteredChicken;
    public double PorkSizzling;
    public double PorkLechon;
    public double CokeFloat;
    public double MtDew;
    public double Royal;
    public double MealTotal;
    public double DrinkTotal;
    public double MealDrinkTotal;
    public double AllTotal;

    public double GetAmount() {
        MealTotal = ButteredChicken + PorkSizzling + PorkLechon;
        DrinkTotal = CokeFloat + MtDew + Royal;
        MealDrinkTotal = MealTotal + DrinkTotal;
        AllTotal = MealDrinkTotal;
        return AllTotal;
    }
       public boolean isEmpty(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    
    private JFrame frame;
    
    public void iExitSystem() {
        frame = new JFrame("Exit");

        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Villanueva Restaurant",
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    
    
    public double PButteredChicken = 200;
    public double PPorkSizzling = 120;
    public double PPorkLechon = 150;
    public double PCokeFloat = 100;
    public double PMtDew = 25;
    public double PRoyal = 25;
    public double Tax = 0.10;

    public double fFindTax(double fAmount) {
        double FindTax = (fAmount * Tax);
        return FindTax;
    }
}
