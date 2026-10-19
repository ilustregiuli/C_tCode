
public class PermutaStringFinal {


    // Recebe duas strings e verifica se uma é uma permutação da outra,
    // ou seja, tem o mesmo tamanho e carateres iguais, somente a
    // disposição dos caracteres é diferente, formando uma nova palavra
    public boolean verificaPermuta(String um, String dois) {

        // confere se tem o mesmo tamanhp: se tamanhos diferentes, já são
        // diferentes
        if(um.length() != dois.length()) {
            System.out.println("São DIFERENTES! Tamanho diferente!");
            return false;
        }
        // cria um array de inteiros: cada posição corresponde a
        // um código da tabela ASCII
        int[] caracteres = new int[128];

        // transforma a string em um array de chars com "um.toCharArray()"
        // itera sobre esse array
        // a cada volta, o caractere "c" é promovido a um inteiro, então
        // na posição daquele inteiro (ou seja, o inteiro referente a tabela
        // ASCII), o array "caracteres" recebe mais um valor "+1"
        for(char c : um.toCharArray()) {
            caracteres[c]++;
        }

        // iterando agora na segunda palavra (também transformada em array de
        // chars), agora decrementa -1 nas posições da segunda palavra; quando
        // for uma posição que já recebeu "+1" da primeira palavra, esse decremento
        // transforma a posição em "0". Mas se a palavra tiver posições diferentes,
        // então irá decrementar "-1" de uma posição vazia (null).
        for(char c : dois.toCharArray()) {
            caracteres[c]--;
        }

        // se todas as posições foram "zeradas" (receberam +1 e depois neutralizadas
        // com o -1), então nenhuma posição terá "-1", não entrará na verificação, então
        // retornará "true" (são iguais). Caso entre na verificação, retornará "false"
        // (não são iguais).
        for(int c : caracteres){
            if(c < 0) {
                return false;
            }
        }
        return true;
    }
}
