package exemplomodeloassociacao;

public class Caminhao {
    private String modelo;
    private String fabricante;    
    private Motor motor;
    private Roda roda;
    private Pneu pneu;
    
    public Caminhao(String modelo, String fabricante, Motor motor, Roda roda, Pneu pneu) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.roda = roda;
        this.pneu = pneu;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }
   
    @Override
    public String toString() {
        return "Caminhão: "
                + "\nModelo: " + this.getModelo()
                + "\nFabricante: " + this.getFabricante()
                + "\nMotor do Caminhão: " + this.getMotor()
                + "\nRoda do Caminhão: " + this.getRoda()
                + "\nPneu do Caminhão: " + this.getPneu();
    }
    
    
}
