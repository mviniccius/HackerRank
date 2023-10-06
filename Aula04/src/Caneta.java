public class Caneta {

    public String modelo;
    private float ponta;

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

    public void status(){
        System.out.println("Dados da caneta!");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
    }

}
