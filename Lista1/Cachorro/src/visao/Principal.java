package visao;
import dominio.Cachorro;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Cachorro sem nome", "nenhuma raça definida", 0);
        Cachorro c2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do cachorro: ");
        c1.setNome(teclado.nextLine());
        System.out.print("Digite a raça do cachorro: ");
        c1.setRaca(teclado.nextLine());
        System.out.print("Digite idade do cachorro: ");
        c1.setIdade(teclado.nextInt());
        c2 = c1.clonarCachorro();
        System.out.println("Nome: " + c2.getNome() + "\nRaça: "+ c2.getRaca() + "\nIdade: " + c2.getIdade());
    }
}
