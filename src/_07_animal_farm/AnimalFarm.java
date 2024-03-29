//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		
		String noise = JOptionPane.showInputDialog("Do you want a llama, cat, cow, duck, or dog?");
		if (noise.equals("cow")) {
			playMoo();
		}
		if (noise.equals("llama"));{
			playLlama();
		}
		if (noise.equals("cat")) {
			playMeow();
		}
		if (noise.equals("dog")) {
			playWoof();
		}
		if (noise.equals("Duck")) {
			playQuack();
		}
		/* 2. Make it so that the user can keep entering new animals. */
		
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}
	

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
