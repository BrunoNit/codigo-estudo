package br.com.pueyo.cafe.domains;

public interface FilaCafe<T> {
    
    
    /**
     * Retorna o primeiro elemento da Fila.
     * O elemento não é removido da primeira posição.
     * 
     * @return T elemento que ocupa a primeira posição na fila
     */
    T consultaPrimeiro();
    
    /**
     * Retorna o primeiro elemento da fila. 
     * O elemento retornado é removido da primeira posição e inserido na última

     * @return T elemento que ocupa a primeira posição na fila
     * 
     */
    T obtemPrimeiro();

    /**
     * Retorna o ultimo elemento da fila.
     * O elemento não é removido da primeira posição. 
     * @return T elemento que ocupa a primeira posição na fila
     * 
     */
    T consultaUltimo();
    
    /**
     * Insere um elemento T na fila e retorna a posição 
     *  
     * @param T elemento a ser inserido 
     * @return int posição onde o elemento foi inserido
     * 
     */
    int inserirNaFila(T in);
    
}
