package br.com.pueyo.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Stream;

import br.com.pueyo.log.appender.PueyoConsoleAppender;

public class PastaArquivo {
    
    private PastaArquivo() {
        
    }
    
    private static final Logger LOGGER = Logger.getLogger(PastaArquivo.class.getName());;

    static {
        LogManager.getLogManager().reset();
        LOGGER.addHandler(new PueyoConsoleAppender());
    }
    
    public static void listarConteudoPasta(String caminho, String ... args){
        try(Stream<Path> saida = Files.list(Paths.get(caminho, args))){
            saida.forEach(s -> LOGGER.log(Level.INFO,s.getFileName().toString()));
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar conteudo da pasta", e);
        }
    }
    
    public static void listarApenasArquivosDaPasta(String caminho, String ... args){
        try(DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(Paths.get(caminho, args), s -> s.toFile().isFile())){
            newDirectoryStream.forEach(s -> LOGGER.log(Level.INFO,s.getFileName().toString()));
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar conteudo da pasta", e);
        }
            
        
    }

    public static void printarConteudoArquivo(String string) {
        try(Stream<String> lines = Files.lines(Paths.get(string))){
            lines.forEach(s -> LOGGER.log(Level.INFO, s));
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao listar conteudo do arquivo", e);
        }
        
    }

    public static void buscarArquivoNoDiretorio(String dir, String nomeArquivo) {
        int maxDepth = 10;
        
        try(Stream<Path> find = Files.find(Paths.get(dir), maxDepth, (path, bfa) -> path.getFileName().toString().equals(nomeArquivo))){
            find.forEach(s -> LOGGER.log(Level.INFO,s.toAbsolutePath().toString()));
        }catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao buscar o arquivo", e);
        }
        
    }

}
