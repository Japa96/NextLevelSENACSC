
package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedidos extends BaseModel{
    
    private String formaPagamento;
    private float valorTotal;
    private List<Produtos> produtos;
    private Endereco endereco;
//    private int id;

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorUnitario) {
        this.valorTotal = valorUnitario;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Pedidos(){
        
        this.produtos = new ArrayList<>();
        this.endereco = new Endereco();
    }
    
}
