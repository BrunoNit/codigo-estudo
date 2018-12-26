package br.com.pueyo.cafe.dao;

import java.util.Arrays;
import java.util.List;

import br.com.pueyo.cafe.domains.Membro;
import br.com.pueyo.cafe.domains.MembroAtivo;

public class MembrosDao {

    public static List<Membro> obterListaMembros() {
        return Arrays.asList(new MembroAtivo("Carol"),
                new MembroAtivo("Gilza"),
                new MembroAtivo("Márcia"),
                new MembroAtivo("Galluzzo"),
                new MembroAtivo("Flop"),
                new MembroAtivo("Bruno"),
                new MembroAtivo("Wagner"),
                new MembroAtivo("Garrido"),
                new MembroAtivo("Gilza"),
                new MembroAtivo("Bené"));
    }

    
    
}
