/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

import java.util.Scanner;

/**
 *
 * @author Américo
 */
public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    
    @Override
    public void play() {
        if(this.getReproduzindo() == false){
            this.setReproduzindo(true);
        
        }else{
            System.out.println("...");
        }
    }

    @Override
    public void pause() {
        if(this.getReproduzindo() == true){
            this.setReproduzindo(false);
        
        }else{
            System.out.println("...");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public void compartilhar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ESCOLHA UM AMIGO PARA COMPARTILHAR");
        System.out.println("----------------------------------");
        System.out.println("[1] João \n[2] Matheus \n[3] Kiko");
        System.out.print(":");
        String amigo = entrada.next();
        System.out.println("Compartilhado com sucesso");
        entrada.close();
    }  
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao) / this.getViews();
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + " titulo = " + titulo + "\navaliacao = " + avaliacao + "\nviews = " + views + "\ncurtidas = " + curtidas + "\nreproduzindo = " + reproduzindo + " }";
    }
    
    
}
