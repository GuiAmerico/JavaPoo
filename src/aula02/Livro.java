/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

import javax.xml.namespace.QName;

/**
 *
 * @author Américo
 */
public class Livro {
    String titulo;
    String cor;
    int qtdPaginas;
    int pagAtual;
    int pagMarcada;
    
    void mudarPagina(){
        this.pagAtual += 1;
    }
    
    void marcarPagina(){
        this.pagAtual = pagMarcada;
    }
    void status(){
        System.out.println("O titulo do livro é: " + this.titulo);
        System.out.println("A cor do livro é: " + this.cor);
        System.out.println("O livro" + this.titulo + "tem " + qtdPaginas + " paginas");
        System.out.println("A pagina atual é: " + this.pagAtual);
    }
}
