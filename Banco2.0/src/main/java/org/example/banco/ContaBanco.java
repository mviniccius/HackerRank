package org.example.banco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);

        if(tipo.equals("CC")){
            setSaldo(50);
        }else if(tipo.equals("CP")){
            setSaldo(150);
        }

    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta com saldo!");
        }else if(this.saldo < 0){
            System.out.println("Conta com valor negativo!");
        }else{
            setStatus(false);
        }
    }

    public boolean depositar(float valor){
        if(getStatus() == true){
            setSaldo(getSaldo() + valor); //observe que usou o setSaldo para atualizar o valor e o getSaldo para recuperar co valor
        return true;
        }else{
            System.out.println("conta encerrada");
            return false;
        }
    }

    public void sacar(float valor){
        if(getStatus() == true){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("ERRO");
        }
    }

    public void tarifaMensal(){
        float tarifa = 0;

        if(getTipo().equals("CC")){
            tarifa = 12;
        } else if (getTipo().equals("CP")) {
            tarifa = 5;
        }

        if(getStatus() == true){
            if(getSaldo() > tarifa){
                setSaldo(getSaldo() - tarifa);
            }else{
                System.out.println("Impossivel realizar o pagamento");
            }
        }
    }


    //metodos especiais
    public String getTipo() {
        return tipo;
    }
    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
