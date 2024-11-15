public class ContratoDeAluguel {

   
    private int codigodaroupa;
    private String metodosdepagamentos;

    public ContratoDeAluguel(int codigodaroupa, String metodosdepagamentos) {
        this.codigodaroupa = codigodaroupa;
        this.metodosdepagamentos = metodosdepagamentos;
    
    }
    
    public int getCodigodaroupa() {
        return codigodaroupa;
    }
    public void setCodigodaroupa(int codigodaroupa) {
        this.codigodaroupa = codigodaroupa;
    }
    public String getMetodosdepagamentos() {
        return metodosdepagamentos;
    }
    public void setMetodosdepagamentos(String metodosdepagamentos) {
        this.metodosdepagamentos = metodosdepagamentos;
    }

    


}

