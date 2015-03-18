package com.restanta.exceptions;

/**
 * @author Cezar
 * @description trateaza erorile care apar in momentul in care nu putem converti
 *              la un numar datele de input
 */
public class InputExp extends Exception {
	private String error;

	public InputExp(String error) {
		this.error = error;
	}

	public void printMessage() {
		System.out.println(error);
	}
}
