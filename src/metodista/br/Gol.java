/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author 248543
 */
public class Gol extends Veiculo {
    private String fabricante;
    private int velocidadeMaxima;
    
    public Gol(int quantidadeRodas, String combustivel) {
        super(quantidadeRodas, combustivel);
        this.fabricante = "Wolksvagen";
        this.velocidadeMaxima = 180;
    }
    public Gol(int quantidadeRodas, String combustivel, String fabricante, int velocidadeMaxima) {
        super(quantidadeRodas, combustivel);
        this.fabricante = fabricante;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public String getFabricante() {
        return this.fabricante;
    }
    public int velocidadeMaxima() {
        return this.velocidadeMaxima;
    }
    public String dizerInformacoes(){
        return "Sou um carro. meu fabricante é a " + this.fabricante + " tenho " 
                + super.getQuantidadeRodas() + " rodas, e utilizo" + super.getCombustivel() +
                " como combustível e atinjo a velocidade máxima de " + this.velocidadeMaxima +
                " km.";
    }
}

