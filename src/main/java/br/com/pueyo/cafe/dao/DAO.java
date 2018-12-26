package br.com.pueyo.cafe.dao;

import java.util.List;

import br.com.pueyo.cafe.domains.Membro;

public interface DAO {
    
    List<Membro> obterListaMembros();

}
