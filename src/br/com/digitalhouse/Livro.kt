package br.com.digitalhouse
//comentario aleatorio
data class Livro (val codigo: Int,
                  val titulo: String,
                  val autor: String,
                  val lancamento: String,
                  var qtEstoque: Int,
                  val preco: Double) {
}