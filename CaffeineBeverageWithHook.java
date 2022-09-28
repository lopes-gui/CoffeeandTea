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
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater(){};
	void pourInCup(){};
	boolean customerWantsCondiments(){
		return true;
	}
}
