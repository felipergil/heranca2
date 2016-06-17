/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodista.br;

/**
 *
 * @author 248543
 */
public class Teste {
    public static void main (String [] args) {
        Camaro camaro = new Camaro(4, "gasolina/álcool");
        Civic civic = new Civic(4, "álcool/gasolina");   
        Gol gol = new Gol(4, "gasolina/álcool");
        
        System.out.println(camaro.dizerInformacoes());
        System.out.println(civic.dizerInformacoes());
        System.out.println(gol.dizerInformacoes());
    }
    
}
