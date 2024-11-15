public class Pessoas implements  IAluguel{

    private String nome;
    private String sobrenome;
    private String datanascimento;
    private int cpf;
    private int rg;
    private int celular;
    private String email;
    private String endereco;


    public Pessoas(String nome, String sobrenome, String datanascimento, int cpf, int rg, int celular, String email,
            String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public int getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Override
    public void EscolherRoupa(){
        System.out.println("Modelo " + nome);


    }

    @Override
    public void AlugarRoupas(){

       System.out.println("CPF" + cpf +"RG" +rg); 
       System.out.println("Número" + celular);
       System.out.println("Email" + email);
       System.out.println("Sobrenome" + sobrenome);
       System.out.println("Endereco" + endereco);

      
       
    }

    

}
