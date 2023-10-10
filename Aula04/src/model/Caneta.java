package model;

public class Caneta {

    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


    public Caneta(String m, String c, float p){ // Metodo construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Dados da caneta!");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.printf("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
