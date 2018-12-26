package br.com.pueyo.lambda;

public class Runner {

    public static void main(String[] args) {
        
        Executor.add(() -> "Bruno");
        Executor.add(() -> "Pueyo");
        Executor.add(() -> "Amaral");
        
        Executor.exec();

    }

}
