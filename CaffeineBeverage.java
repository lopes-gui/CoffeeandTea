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
public abstract class CaffeineBeverage {
    final void prepareRecipe (){
boilWater();
brewCoffeeGrinds ();
pourInCup ();
addSugarAndMilk ();
	
	}
	abstract void boilWater();
    abstract void  steepTeaBag ();
    public void  pourInCup(){};
    public void addLemon (){};

    private void addSugarAndMilk() {
    }

    private void brewCoffeeGrinds() {
    }
}
