/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author 248543
 */
public class Veiculo {
    private int QuantidadeRodas;
    private String combustivel;
    
    public Veiculo( int quantidadeRodas, String combustivel) {
        this.QuantidadeRodas = quantidadeRodas;
        this.combustivel = combustivel;
    }
    
    public int getQuantidadeRodas(){
        return this.QuantidadeRodas;
    }
    public String getCombustivel(){
        return this.combustivel;
    }
}
