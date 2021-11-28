
package Model;

import java.time.LocalDateTime;

public abstract class BaseModel {
    
    private int id;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAtualizada() {
        return dataAtualizada;
    }

    public void setDataAtualizada(LocalDateTime dataAtualizada) {
        this.dataAtualizada = dataAtualizada;
    }
    
    
}
