public class Criando_Vetor {
    public static void main(String[] args){
        int soma = 0;
        int vetor[] = new int[25];

        for (int i = 0; i < 5; i++) { // inserindo dados no vetor
        vetor[i] = i * 5;
        }

        for (int I = 0; I < 5; I++) { // percorrendo o vetor e mostrando os valores
        System.out.println(vetor[I]);
        }

        for (int i = 0; i < 5; i++) { //percorrendo para calcular a soma de todos o valores do vetor
        soma = soma + vetor[i];
        }
        System.out.println("Soma dos numeros armazenados no vetor: " + soma);
    }
}