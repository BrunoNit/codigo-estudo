package br.com.pueyo.paralell;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import br.com.pueyo.log.appender.PueyoConsoleAppender;

public class Runner {
    
    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());

    static {
        LogManager.getLogManager().reset();
        LOGGER.addHandler(new PueyoConsoleAppender());
    }

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "INICIANDO");
        ConcurrentMap<String, List<String>> classificarAcoes = ParalellProcessing.classificarAcoes();
        String next = "PETR4";
        if(classificarAcoes.keySet().contains(next)) {
            List<String> list = classificarAcoes.get(next);
            System.out.println(next);
            for(String linhaDaAcao: list) {
                System.out.println(linhaDaAcao);
            }
        }
        
    }

}
