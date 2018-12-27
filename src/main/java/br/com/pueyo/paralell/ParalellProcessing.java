package br.com.pueyo.paralell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.pueyo.log.appender.PueyoConsoleAppender;

public class ParalellProcessing {
    
    
    
    private ParalellProcessing() {
        super();
    }

    private static final Logger LOGGER = Logger.getLogger(ParalellProcessing.class.getName());

    static {
        LogManager.getLogManager().reset();
        LOGGER.addHandler(new PueyoConsoleAppender());
    }
    
    public static ConcurrentMap<String, List<String>> classificarAcoes(){
        try(Stream<String> filter = Files.lines(Paths.get("/home/07669751770/Downloads/COTAHIST_A2018.TXT"))
                .parallel()
                .filter(s -> "01".equals(s.substring(0, 2)) && "010".equals(s.substring(24, 27))).parallel();
                ){
            return filter.collect(Collectors.groupingByConcurrent(t -> t.toString().substring(12, 24).trim()));
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar conteudo do arquivo", e);
        }
        return null;
    }

}
