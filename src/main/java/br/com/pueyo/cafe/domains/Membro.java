package br.com.pueyo.cafe.domains;

public abstract class Membro{
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
   
    
    @Override
    public String toString() {
        return "Membro [name=" + name + "]";
    }
    
   
    
    
}
