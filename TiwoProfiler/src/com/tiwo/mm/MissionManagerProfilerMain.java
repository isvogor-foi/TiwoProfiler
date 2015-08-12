package com.tiwo.mm;

import java.util.Scanner;

import com.tiwo.mission.MissionManagerMain;

public class MissionManagerProfilerMain {
	/**
	 * Profiler project for the MissionManager project / component
	 * The main method / interface is the constructor, wich automatically loads the mission (*.mis) file
	 * and executes it
	 * 
	 * 
	 */
	 
	public static void main(String[] args) {
		
		pauseProg();
		for(int i = 0; i < 2000; i++)
			profileMM();
		
	}
	
	public static void profileMM(){
		for(int i = 1; i <= 5; i++){
			MissionManagerMain mm = new MissionManagerMain("/home/ivan/git/TiwoProfiler/TiwoProfiler/src/com/tiwo/mm/demomissions/" + i + ".mis");
		}
	}
	
	public static void pauseProg(){
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}

}
