package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("%nQuantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        double maior = 0, menor = 3, somaF = 0, nM = 0;


        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ",(i+1));
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ",(i+1));
            genero[i] = sc.next().charAt(0);

            maior = (altura[i]>maior) ? altura[i] : maior;
            menor = (altura[i]<menor) ? altura[i] : menor;
            nM += genero[i]=='M' ? 1 : 0;
            somaF += genero[i]=='F' ? altura[i] : 0;
        }

        double media = somaF/(n-nM);

        System.out.printf("Menor altura = %.2f",menor);
        System.out.printf("%nMaior altura = %.2f",maior);
        System.out.printf("%nMédia da altura das mulheres = %.2f",media);
        System.out.printf("%nNúmero de homens = %.0f",nM);


        System.out.println();
        sc.close();
    }
}
