package br.com.digitalhouse

data class Colecao(val colecao:MutableMap<Int, List<Livro>>,
                   val preco: Float,
                   val codigo:Int,
                   val descricao:String) {

}