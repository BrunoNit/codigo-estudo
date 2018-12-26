package br.com.pueyo.cafe.domains;

public class MembroAtivo extends Membro {
    
    public MembroAtivo(String name) {
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
