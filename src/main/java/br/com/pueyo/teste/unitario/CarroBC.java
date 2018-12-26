package br.com.pueyo.teste.unitario;

public class CarroBC {
	
	
	
	public String carroPossuiAbs(Carro carro){
		if(carro.possuiABS()){
			return "O carro possui ABS";
		}
		return "O carro Não possui ABS";
	}
	 

}
