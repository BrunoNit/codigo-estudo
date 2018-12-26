package br.com.pueyo.enums;

public class Runner {

    public static void main(String[] args) {
        String entrada = "cnpj";
        
        EnumTeste e = EnumTeste.buscarPorCodigo(entrada);
        System.out.println(e.getOrigem());

    }

}
