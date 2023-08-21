package ex210823;


//Ficam privados para que sejam acessados somente pro set & get

public class Profissao {
   
    private String nome, endereco, DataNasc, genero;
    int cpf;
    
 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    public String getDataNasc() {
        return DataNasc;
    }
    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }
    
    
  
  public String getGenero() {
        return genero;
    }
  public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
  public int getCpf() {
        return cpf;
    }  
  public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
}
