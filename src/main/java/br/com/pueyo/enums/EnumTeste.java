package br.com.pueyo.enums;

public enum EnumTeste {
    
    TESTE1("NATUREZA","CREDIMEI"),
    TESTE2("NOME","CREDIMEI"),
    TESTE3("CCMEI","MEI"),
    TESTE4("CNPJ","RFB");
    
    private String nomeCampo;
    private String origem;
    
    private EnumTeste(String nomeCampo, String origem) {
        this.nomeCampo = nomeCampo;
        this.origem = origem;
    }
    
    
    public static EnumTeste buscarPorCodigo(String i) {
        for(EnumTeste e: values()) {
            if(e.nomeCampo.equalsIgnoreCase(i)) {
                return e;
            }
        }
        return null;
    }


    public String getOrigem() {
        return origem;
    }


    public String getNomeCampo() {
        return nomeCampo;
    }

}
