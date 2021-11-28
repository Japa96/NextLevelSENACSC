
package Model;

public class Produtos extends Pedidos{
    
    private int id;
    private String nome;
    private String valor;
    private String descricao;
    private String peso;
    private int quantidade;
    private String categoria;
    
    public Produtos(int id, String nome, String valor, String descricao, String peso, int quantidade, String categoria) {
        
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.categoria = categoria;        
    }
    
    public Produtos(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
