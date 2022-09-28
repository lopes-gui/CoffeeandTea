/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beveragetestdrive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guilh
 */
public class TeaWithHook  extends CaffeineBeverageWithHook{
      @Override
    void brew() {
    }

    @Override
    void addCondiments() {
    }
    @Override
 
	
	public boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")){
		return true ;
		}
		else {
			return false;
		}
		
}
public String getUserInput(){
	String answer=null;
	System.out.println("would you like some sugar and milk with your coffee (Y/N)");
	BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	try {
		answer=in.readLine();
	}catch (IOException ioe){
		System.err.println("IO error trying to read your answer");
	}
	if(answer == null){
		return "no";
	}
	return answer;
}
	
}
