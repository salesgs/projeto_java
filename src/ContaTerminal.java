public class ContaTerminal {
  /**
   * @param "numero"  :irá representar o número da conta associada a um cliente
   * @param "agencia" : irá representar agência vinculada ao cliente
   * @param "cliente" :irá receber um objeto cliente que estará vinculado a essa conta
   * @param "saldo"   :irá representar um saldo colocado vinculado a esse cliente
   */
  protected int numero;
  protected String agencia;
  protected Cliente cliente;  
  protected double saldo;

  public ContaTerminal(int numero, String agencia,Cliente cliente){
    this.setNumero(numero);
    this.setAgencia(agencia);
    this.setSaldo(0);
    this.setCliente(cliente);
  }

  private int getNumero(){
    return numero;
  }
  private void setNumero(int numero){
    this.numero = numero;
  }
  private String getAgencia(){
    return agencia;
  }
  private void setAgencia(String agencia){
    this.agencia = agencia;
  }
  private Cliente getCliente(){
    return cliente;
  }
  private void setCliente(Cliente cliente){
    this.cliente = cliente;
  }
  private double getSaldo(){
    return saldo;
  }
  private void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public void dados(){
    System.out.println("Olá[ " + this.getCliente().nome +" ] Obrigado por criar um conta em nosso banco, sua agência é [" +this.getAgencia() +" ] "+ "conta [" +this.getNumero() + "]" + " e seu saldo [ " +this.getSaldo() +" ] " + " já está disponível para saque");
  }
}
