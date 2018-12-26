package br.com.pueyo.cafe.domains.business;

import java.util.ArrayList;
import java.util.List;

import br.com.pueyo.cafe.domains.FilaCafe;
import br.com.pueyo.cafe.domains.Membro;
import br.com.pueyo.cafe.domains.MembroNulo;

public class FilaFaltantes<T extends Membro> extends  ArrayList<T> implements FilaCafe<T>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public FilaFaltantes(List<T> lista) {
        super(lista);
    }

    @Override
    public T consultaPrimeiro() {
       if(this.isEmpty()) {
           return criarElementoNulo();
       }
        return this.get(0);
    }

    @Override
    public T obtemPrimeiro() {
        if(this.isEmpty()) {
            return criarElementoNulo();
        }
        T m = this.get(0);
        this.remove(0);
        this.add(m);
        return m;
    }

    @Override
    public T consultaUltimo() {
        if(this.isEmpty()) {
            return criarElementoNulo();
        }
        return this.get(this.size() -1);
    }

    @Override
    public int inserirNaFila(T in) {
        return 0;
    }
    
    private T criarElementoNulo() {
        return ((T) new MembroNulo("A LISTA ESTÁ VAZIA"));
    }
    

}
