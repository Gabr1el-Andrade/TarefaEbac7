/**
 * @author tisco
 * essa classe demonstra a marca, ano e nome do carro.
 */

public class Identificador

{public static void main(String[] args){

               Carro carro = new Carro();
     carro.setMarca("camaro");
     carro.setAno(1995);
     carro.setNomeCarro("camaro ss 55");

               System.out.println(carro.getNomeCarro());
               System.out.println(carro.getAno());
               System.out.println(carro.getMarca());
}

}

