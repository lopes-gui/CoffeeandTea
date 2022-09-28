/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragetestdrive;

/**
 *
 * @author guilh
 */
public class BeverageTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
 TeaWithHook  teaHook = new TeaWithHook();
 CoffeeWithHook coffeeHook = new CoffeeWithHook();
 System.out.println("\n making tea");
 
 teaHook.prepareRecipe();
  System.out.println("\n making coffe");
 
 coffeeHook.prepareRecipe();
    }
    
}
