package com.tiwo.ac;

import java.util.Scanner;

import com.tiwo.communication.Serial;

/**
 * 
 * @author ivan
 *
 * The main interfaces / methods of the Actuator control component (i.e. TiwoCommunication project) are
 *  - isConnected
 *  - sendMessage
 *  - getPorts
 */

public class ActuatorControlProfilerMain {

	public static void main(String[] args) throws Exception {
		pauseProg();
		
		Serial serialInstance = Serial.getInstance();
		
		serialInstance.getPorts();
		
		serialInstance.connect("COM3", 9100);
		
		serialInstance.sendMessage("FORWARD");
		

	}
	
	
	
	public static void pauseProg(){
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}

}
