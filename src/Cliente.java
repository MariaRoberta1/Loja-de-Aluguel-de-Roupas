public class Cliente extends Pessoas{
 
   public int Desconto;
   public String FormaDePagamento;
   public String HistoricoDeCompras;
   
public Cliente(String nome, String sobrenome, String datanascimento, int cpf, int rg, int celular, String email,
        String endereco, int desconto, String formaDePagamento, String historicoDeCompras) {
    super(nome, sobrenome, datanascimento, cpf, rg, celular, email, endereco);
    Desconto = desconto;
    FormaDePagamento = formaDePagamento;
    HistoricoDeCompras = historicoDeCompras;
}

public int getDesconto() {
    return Desconto;
}

public String getFormaDePagamento() {
    return FormaDePagamento;
}

public String getHistoricoDeCompras() {
    return HistoricoDeCompras;
}

public void setDesconto(int desconto) {
    Desconto = desconto;
}

public void setFormaDePagamento(String formaDePagamento) {
    FormaDePagamento = formaDePagamento;
}

public void setHistoricoDeCompras(String historicoDeCompras) {
    HistoricoDeCompras = historicoDeCompras;

}

}