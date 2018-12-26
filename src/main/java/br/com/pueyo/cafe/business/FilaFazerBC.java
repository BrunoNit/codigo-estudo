package br.com.pueyo.cafe.business;

import java.util.ArrayList;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import br.com.pueyo.cafe.dao.MembrosDao;
import br.com.pueyo.cafe.domains.Membro;
import br.com.pueyo.cafe.domains.MembroNulo;
import br.com.pueyo.cafe.domains.business.FilaFaltantes;
import br.com.pueyo.cafe.domains.business.FilaRegular;

public class FilaFazerBC {
    
    private FilaRegular<Membro> filaRegular =  new FilaRegular<>(MembrosDao.obterListaMembros());
    private FilaFaltantes<Membro> filaFaltantes =  new FilaFaltantes<>(new ArrayList<>());
    
    
    
    public FilaFazerBC() {
        for(Membro o: MembrosDao.obterListaMembros()) {
            this.filaRegular.add(o);
        }
    }
    
    public Membro consultaProximoAFazer() {
        
        if(filaRegular.isEmpty()) {
            return new MembroNulo("Fila Vazia");
        }
        return filaRegular.consultaPrimeiro();
    }
    
    public void transfereFaltante() {
        Membro executorTarefa = this.filaRegular.obtemPrimeiro();
        this.filaFaltantes.add(executorTarefa);
    }
    
    public String consultarListaFazer() {
        return ReflectionToStringBuilder.toString(this.filaRegular.toArray());
    }
    public String consultarListaFaltantes() {
        return ReflectionToStringBuilder.toString(this.filaFaltantes.toArray());
    }

}
