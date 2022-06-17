public class Caneta {
     private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
 

    
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public String getmodelo() {
        return this.modelo;
    }
    public void setModelo(String  m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true; 
    }
    public void destampar () {
        this.tampada = false;
    }
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
    }
}
