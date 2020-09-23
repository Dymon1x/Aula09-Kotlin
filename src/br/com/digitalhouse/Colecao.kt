package br.com.digitalhouse

data class Colecao (val colecao:MutableMap<Int, Livro>,
                   val preco:Int,
                   val codigo:Int,
                   val descricao:String) {

}