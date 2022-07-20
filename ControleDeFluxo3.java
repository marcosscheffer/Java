public class ControleDeFluxo3 {
    public static void main(String[] args) {
        int idade = 2;

        if(idade <= 12 && idade >= 0) {
            System.out.println("Ainda é uma criança");
        } else if(idade >= 13 && idade < 18) {
            System.out.println("Já é um adolecente!");
        } else if(idade >= 18) {
            System.out.println("Já é um adulto!");
        } else {
            System.out.println("Idade invalida!");
        }
    }
}
