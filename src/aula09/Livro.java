/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author Américo
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    
    
    public String detalhes(){
        return "O titulo do livro é :" + this.getTitulo() +
        "\nAutor do livro: " + this.getAutor() +
        "\nQuantidade de paginas: " + this.getTotPaginas() +
        "\nPagina atual: " + this.getPagAtual() +
        "\nEstá aberto? " + this.getAberto() +
        "\nNome do leitor: " + this.getLeitor().getNome();
    
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        
        if(!this.getAberto()){
            
            System.out.println("Já está aberto");
        }else{
            System.out.println("Aberto com sucesso");
            this.setAberto(this.getAberto());
        }
    }

    @Override
    public void fechar() {
        
        if(!this.getAberto()){
            
            System.out.println("fechado com sucesso");
            this.setAberto(this.getAberto());
            
            }else{
            System.out.println("Já está fechado");
        
            
        }
    }

    
    public void folhear(int pag) {
        if(pag < this.getTotPaginas()){
        this.pagAtual = pag;
        }else{
            this.setPagAtual(0);
        }
       
        
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() < this.getTotPaginas())
        this.pagAtual += 1;
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() >= 1){
            this.pagAtual -= 1;
        
        }
        
    }

    @Override
    public void folhear() {
        
    }
    
    
    
}
