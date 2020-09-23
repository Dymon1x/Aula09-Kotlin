package br.com.digitalhouse

class Estoque (val listaColecao: MutableMap<Int, Colecao> = mutableMapOf<Int, Colecao>(),
               val listaLivro: MutableMap<Int, Livro> = mutableMapOf<Int, Livro>())
{

    fun cadastrarLivro (livro: Livro) {
        listaLivro!![listaLivro.size]=livro
        println("Adicionado livro ${livro.titulo} ao estoque")
    }

    fun cadastrarColecao (colecao: Colecao) {
        listaColecao!![listaColecao.size]=colecao
        println("Adicionada a coleção ${colecao.descricao} ao estoque")
    }

    fun consultarLivro (indice: Int) {
        if (listaLivro.get(indice) != null){
            println(listaLivro[indice]!!.titulo)
        }
        else {
            println("Livro não encontrado")
        }
    }

    fun efetuarVenda (indice: Int) {
        if (listaLivro.get(indice)!!.qtEstoque > 0){
            listaLivro.get(indice)!!.qtEstoque -= 1
            println("livro ${listaLivro.get(indice)!!.titulo} vendido")
        } else {
            listaLivro.remove(indice)
            println("Livro fora estoque ")
        }
    }
}
