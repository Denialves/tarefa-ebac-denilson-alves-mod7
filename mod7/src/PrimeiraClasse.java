/**
 * @author Denilson
 */
public class PrimeiraClasse {

    /**
     *
     * @param args valores do sistema
     */

    public static void main(String args[]){
        System.out.println("Cliente");
        Cliente Cliente = new Cliente();
        Cliente.cadastrarCto("CTO 1");
        System.out.println(Cliente.getCto());


    }
}
