package br.com.pueyo.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Runner {
    
    
    
    public boolean isValoresValidos(BigDecimal recolhido, BigDecimal aRecolher) {
        BigDecimal resultado = aRecolher.setScale(2, RoundingMode.CEILING).subtract(recolhido.setScale(2, RoundingMode.CEILING));
        return resultado.abs().compareTo(getMargemErro()) < 0;
    }

    public static void main(String[] args) {
        BigDecimal bd2 = new BigDecimal("10.55798949849849");
        BigDecimal bd1 = new BigDecimal("11.56798949849849");
        Runner r = new Runner();
        
        System.out.println(r.isValoresValidos(bd1, bd2));
    }
    
    private BigDecimal getMargemErro() {
        return new BigDecimal(BigInteger.valueOf(100), 2);
    }

}
