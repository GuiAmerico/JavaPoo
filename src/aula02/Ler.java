/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author Américo
 */
public class Ler {
    public static void main(String[] args) {
        
    Livro livro = new Livro();
    livro.titulo = "Dom Quixote";
    livro.cor = "Azul";
    livro.qtdPaginas = 200;
    livro.pagAtual = 1;
    livro.mudarPagina();
    livro.mudarPagina();
    livro.mudarPagina();
    livro.mudarPagina();
    livro.mudarPagina();
    
    livro.status();
    
    
    }
    
}
