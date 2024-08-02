import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String carro;
        int servico;
        int preco;

        Usuario u = new Usuario();
        System.out.println("Informe seu nome completo: ");
        u.setNome(scan.nextLine());
        System.out.println("Informe o modelo do seu carro: ");
        u.setCarro(scan.nextLine());
        System.out.println("Segue o preço dos serviços: \nHigienização Interna - 50 R$ \nPolimento - 100 R$ \nLavagem Completa - 200 R$");
        System.out.println("Seja bem vindo " + u.getNome() + "! Escolha o serviço que deseja realizar em seu carro: \n1 - Higienização Interna \n2 - Polimento \n3 - Lavagem Completa");
        u.setServico(scan.nextInt());

        if(u.getServico() == 1){
            preco = 50;
        }
        else if(u.getServico() == 2){
            preco = 100;
        }
        else{
            preco = 200;
        }

        System.out.println("Segue sua ficha: \nNome: " + u.getNome() + "\nCarro: " + u.getCarro() + "\nPreço: " + preco + "R$");
    }
}