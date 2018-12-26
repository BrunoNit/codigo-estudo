package br.com.pueyo.cafe.domains;

public class MembroAfastado extends Membro {
    
    public MembroAfastado(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }

 

}
