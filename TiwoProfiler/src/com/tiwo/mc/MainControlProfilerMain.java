package com.tiwo.mc;

import java.util.Scanner;

import com.tiwo.forms.MainForm;

/**
 * 
 * @author ivan
 * Send
 * EnableKeyboard
 * loadImage
 * setImage
 * StartFpgaCommunication
 * LoadAutonomusMission
 *
 */

public class MainControlProfilerMain {
	
	public static void main(String[] args) {
		
		pauseProg();
		MainForm mf = new MainForm();
		
		mf.frame.setVisible(true);

		pauseProg();
		
		// send command 
		mf.sendButtonAction.actionPerformed(null);
		/*
		// enable keyboard
		mf.keyboardEnableAction.actionPerformed(null);
		
		// load image
		mf.loadImage("");
		
		// set image
		mf.setImage(null);
		
		// start fpga communication
		mf.btnSendToClientListener.actionPerformed(null);
		
		// load script (and execute)
		mf.btnTestScriptClickListener.actionPerformed(null);
		*/
		
		
		System.out.println("TiwoMain profiling done...");
		

	}
	
	public static void pauseProg(){
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}

}
