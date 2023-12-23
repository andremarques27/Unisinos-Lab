package semanas11_12;

public class Teste {

    public int metodo(int[] array){
        int x = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[x]){
                x = i;
            }
        }
        return x;
    }





    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i=0; i < valores.length; i++)
            if(i % 2 == 0)
                System.out.print(valores[i++]+" ");
            else
                System.out.print(valores[i--]+" ");

    }


}
