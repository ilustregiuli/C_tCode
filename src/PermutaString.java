import java.util.Arrays;

public class PermutaString {

    // Recebe duas strings e verifica se uma é uma permutação da outra,
    // ou seja, tem o mesmo tamanho e carateres iguais, somente a
    // disposição dos caracteres é diferente, formando uma nova palavra
    public boolean verificaPermuta(String um, String dois) {
        //verifica se tem tamanho diferente, se tiver, já não é
        //uma permuta de letras
        if(um.length() != dois.length()) {
            System.out.println("São DIFERENTES! Tamanho diferente!");
            return false;
        }

        // se tem o mesmo tamanho, vamos ordenar
        // cria um array de chars com cada string...
        char[] umArrayChar = um.toCharArray();
        char[] doisArrayChar = dois.toCharArray();

        // ... e depois ordena cada um deles
        Arrays.sort(umArrayChar);
        Arrays.sort(doisArrayChar);

        // cria uma nova string com os chars ordenados e referencia
        // na antiga variável
        um = new String(umArrayChar);
        dois = new String(doisArrayChar);

        // verifica se são iguais
        return um.equals(dois);
    }

}
