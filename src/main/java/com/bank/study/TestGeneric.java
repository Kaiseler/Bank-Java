package com.bank.study;

public class TestGeneric {

	public static void main(String[] args) {
		FormaGenerica form = new FormaGenerica<Integer, String>();
		form.valor = Integer.valueOf(10);
		form.outroValor = "asdfsadf";
		
		System.out.println(form.valor);
		

	}

}
