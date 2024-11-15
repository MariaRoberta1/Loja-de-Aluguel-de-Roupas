public abstract class Aluguel {

    private String modelo;
    private String status; 
    private int codigodaroupa;
    private float preco;

    public Aluguel(int codigodaroupa, String modelo, float preco, String status) {
        this.codigodaroupa = codigodaroupa;
        this.modelo = modelo;
        this.preco = preco;
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public String getStatus() {
        return status;
    }

    public int getCodigodaroupa() {
        return codigodaroupa;
    }

    public float getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCodigodaroupa(int codigodaroupa) {
        this.codigodaroupa = codigodaroupa;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
 

    
    public abstract void OlharRoupas();
    public abstract void EscolherRoupa();
    public abstract void AlugarRoupas();
}

