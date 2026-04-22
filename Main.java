package Aula6_Method_References_labs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args){

        List<Produto> produtos = new ArrayList<>();

        // CONCEITO INTRODUZIDO NO JAVA 8: INTERFACE BiFunction PARA CRIAR OBJETOS DE CLASSE
        // PARA O CASO DE ELES PRECISAREM DE DOIS PARÂMETROS NO CONSTRUTOR E FIZEMOS ISSO APENAS
        // COM UMA INSTÂNCIA DESSA INTERFACE QUE CHAMA O MÉTODO ABSTRATO aplly().
        // ALÉM DISSO, PASSAMOS UMA REFERÊNCIA A KEYWORD new, A RESPONSÁVEL POR CRIAR OBJETOS DE CLASSE
        BiFunction<String, Double, Produto> criaProduto = Produto::new;
        Produto produto1 = criaProduto.apply("Notebook", 3500.0);
        Produto produto2 = criaProduto.apply("Celular", 1500.0);
        Produto produto3 = criaProduto.apply("Televisão", 2000.0);
        Produto produto4 = criaProduto.apply("Tablet", 1200.0);
        Produto produto5 = criaProduto.apply("Impressora", 1200.0);
        Produto produto6 = criaProduto.apply("Computador", 3500.0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);

        // 1° DESAFIO:
        // ORDENAR A NOSSA LISTA DE PRODUTOS DE FORMA CRESCENTE TENDO COMO CRITÉRIO
        // O PREÇO DE CADA PRODUTO.
        // USAMOS UMA REFERÊNCIA AO MÉTODO getPreco, AO INVÉS DE UMA EXPRESSÃO LAMBDA
        // OUTRA MELHORIA QUE FIZEMOS FOI UTILIZAR O MÉTODO comparingDouble COMO ARGUMENTO
        // DO MÉTODO sort(), EM OUTRAS PALAVRAS, POUPAMOS TEMPO SEM PRECISAR CRIAR UM NOVO
        // COMPARATOR PARA ISSO
        produtos.sort(Comparator.comparingDouble(Produto::getPreco));

        // TAMBÉM UTILIZAMOS UMA REFERÊNCIA AO MÉTODO println PARA FAZER A ITERAÇÃO DOS OBJETOS
        // DEPOIS DE ORDENADOS
        produtos.forEach(System.out::println);

        System.out.println("----------------------------------");

        // 2° DESAFIO:
        // ORDENAR OS NOMES DOS PRODUTOS EM ORDEM ALFABÉTICA

        produtos.sort(Comparator.comparing(Produto::getNome));

        produtos.forEach(System.out::println);

        System.out.println("----------------------------------");

        // 3° DESAFIO:
        // VAMOS AGORA FAZER O ENCADEAMENTO DE MÉTODOS. O PRIMEIRO CRITÉRIO SERÁ O PREÇO DOS PRODUTOS
        // CASO HAJA PRODUTOS COM O MESMO PREÇO, VAMOS USAR OUTRO CRITÉRIO PARA ORDENAR A LISTA
        // QUE VAI SER O NOME DOS PRODUTOS, E PARA ISSO VAMOS USAR O MÉTODO thenComparing().
        produtos.sort(Comparator.comparingDouble(Produto::getPreco)
                .thenComparing(Produto::getNome));

        produtos.forEach(System.out::println);

        System.out.println("----------------------------------");
    }
}
