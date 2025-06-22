package com.pm.javabasic;

public class NotesCount {

	public static void main(String[] args) {
		int[] notes = { 2000, 1000, 500, 200, 100, 50, 20, 10 };
		int count = 0;
		int rupees = 5500;

		for (int i = 0; i < notes.length; i++) {
			count = rupees / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + "=" + count);
			}

			rupees = rupees % notes[i];

		}

	}

}
