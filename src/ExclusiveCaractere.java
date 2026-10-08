public class ExclusiveCaractere {

    // Recebe uma atring e verifica se algum caracter se repete na palavra/frase
    public boolean verificaString(String word) {

        //Cria um array de booleanos de 128 posicoes, default "false"
        //Cada índice corresponde ao código ASCII de um caracter (char)
        //Coincidentemente, os índices vão de 0 a 127 como a tabela ASCII
        boolean[] ascii = new boolean[128];

        // Após isso, varremos a string: comparamos a posição atual com a posição
        // no índice do array; se na posição estiver "false", é porque ainda não
        // foi encontrado um caracter nessa posição. Então, alteramos para "true" -
        // "foi encontrado". Se passar por todas as posições da String e não se repetir
        // nenhuma vez, encerra a função com "false" - não tem caracteres repetidos
        // Caso existe "true" na posição quando for comparado, é porque já foi encontrado,
        // então, encerramos a função com "true" - tem caracteres repetidos
        char[] caracteres = word.toCharArray();

        for(char c : caracteres) {
            if(ascii[c]) {
                return true;
            } else {
                ascii[c] = true;
            }
        }
        return false;
    }
}
