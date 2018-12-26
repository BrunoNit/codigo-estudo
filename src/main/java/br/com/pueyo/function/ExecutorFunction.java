package br.com.pueyo.function;

import java.util.function.Function;

import br.com.pueyo.designpattern.builder.Veiculo;

public class ExecutorFunction<B> {
    
    private Veiculo veiculo;
    private Function<Veiculo, B> done;
    
    public static <T>ExecutorFunction <T> start(Function<Veiculo, T> f) {
        return new ExecutorFunction<T>(f);
        
    }
    
    private ExecutorFunction(Function<Veiculo, B> funcao) {
        this.done = funcao;
    }
    
    public B execute(){
        return this.done.apply(veiculo);
        
    }

}
