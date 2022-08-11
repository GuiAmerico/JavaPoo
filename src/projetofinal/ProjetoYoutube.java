/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author Américo
 */
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[5];
        video[0] = new Video("Algoritmos");
        video[1] = new Video("Lógica de programação");
        video[2] = new Video("Java Fundamentos");
        video[3] = new Video("Java POO");
        video[4] = new Video("Java Web");
        
        Gafanhoto g[] = new Gafanhoto[4];
        g[0] = new Gafanhoto("Cara pálida", 19, "M", "palida123");
        g[1] = new Gafanhoto("Cueca de Couro", 39, "M", "cuecaoDeCouro");
        g[2] = new Gafanhoto("Touro Sentado", 27, "M", "TourudoPJL");
        g[3] = new Gafanhoto("Mancada", 31, "M", "meuPaiManca");
        
        
        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(g[0], video[1]);
        visu[0].avaliar();
        
        visu[1] = new Visualizacao(g[0], video[2]);
        visu[1].avaliar(6);
        
        visu[2] = new Visualizacao(g[1], video[3]);
        visu[2].avaliar(93.4);
        
        visu[3] = new Visualizacao(g[2], video[4]);
        visu[3].avaliar(56.8);
        
        visu[4] = new Visualizacao(g[3], video[1]);
        visu[4].avaliar(9);
        
        System.out.println(visu[0].toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(visu[1].toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(visu[2].toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(visu[3].toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(visu[4].toString());
    
    
    }
    
}
