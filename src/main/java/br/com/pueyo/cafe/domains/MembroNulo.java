package br.com.pueyo.cafe.domains;

public class MembroNulo extends Membro {
    
    public MembroNulo(String name) {
       this.name = name;
    }
    
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
