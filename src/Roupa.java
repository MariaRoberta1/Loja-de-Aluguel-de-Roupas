public class Roupa {

    private String cor;
    private int tamanho;
    private String modelo;
    private String status; //se a roupa esta disponivel ou se ja foi alugada
    private int codigodaroupa;
    private float preco;

    public Roupa(int codigodaroupa, String cor, String modelo, float preco, String status, int tamanho) {
        this.codigodaroupa = codigodaroupa;
        this.cor = cor;
        this.modelo = modelo;
        this.preco = preco;
        this.status = status;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigodaroupa() {
        return codigodaroupa;
    }

    public void setCodigodaroupa(int codigodaroupa) {
        this.codigodaroupa = codigodaroupa;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    
}