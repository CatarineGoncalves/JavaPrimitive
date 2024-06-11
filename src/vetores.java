import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {

        int[] numbers = {100, 12, 23, 48, 339, 123, 32, 55};
        int menor = numbers[0];
        int maior = numbers[0];
        int media = 0;


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > maior) {
                maior = numbers[i];
            }

            if(numbers[i] < menor) {
                menor = numbers[i];
            }

            media += numbers[i];

        }

        System.out.println("O menor número é " +menor+ ", já o maior número é " +maior+ ", e a média entre todos os números é de " +media/numbers.length);

//
//
//        String[] letras = {"A", "B", "C", "D"};
//
//        for (int i = 0; i < letras.length ; i++) {
//            System.out.println(Arrays.toString(letras));
//        }



    }

}
