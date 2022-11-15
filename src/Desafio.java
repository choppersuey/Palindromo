import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        if(palavra.equals(palavraInvertida)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}