public class Cliente {
  protected String nome; 
  protected String cpf;

  public Cliente(String nome,String cpf){
    this.setNome(nome);
    this.setCpf(cpf);
  }

  private String getNome(){
    return nome;
  }
  private void setNome(String nome){
   this.nome = nome;
  }
  
  private String getCpf(){
    return cpf;
  }
  private void setCpf(String cpf){
   this.cpf = cpf;
  }
  
}
