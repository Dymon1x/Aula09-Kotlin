package br.com.digitalhouse

fun main() {
    val livro1 = Livro(1, "Harry Potter1", "JK", "20/01/1999", 2, 100.0f)
    val livro2 = Livro(2, "Harry Potter2", "JK", "20/01/2000", 2, 100.0f)
    val livro3 = Livro(3, "Narnia1", "asdfghjklç", "08/06/2000", 10, 50.0f)
    val livro4 = Livro(4, "Narnia2", "asdfghjklç", "08/06/2000", 10, 50.0f)
    val livro5 = Livro(5, "Senhor dos Aneis1", "qwertyuio", "10/05/1995", 20, 100.0f)
    val livro6 = Livro(6, "Senhor dos Aneis2", "qwertyuio", "10/05/1998", 20, 100.0f)

    val lista12 = listOf(livro1, livro2)
    val lista34 = listOf(livro3, livro4)
    val lista56 = listOf(livro5, livro6)

    val colecao1 = Colecao(mutableMapOf(10 to lista12), 170.0f, 1, "Coleção de 2 Livros Harry Potter")
    val colecao2 = Colecao(mutableMapOf(20 to lista12), 70.0f, 1, "Coleção de 2 Livros Narnia")
    val colecao3 = Colecao(mutableMapOf(30 to lista12), 180.0f, 1, "Coleção de 2 Livros Senhor dos Aneis")
    val estoque1 = Estoque()
    println("=== Os livros ===")
    estoque1.cadastrarLivro(livro1)
    estoque1.cadastrarLivro(livro2)
    estoque1.cadastrarLivro(livro3)
    estoque1.cadastrarLivro(livro4)
    estoque1.cadastrarLivro(livro5)
    estoque1.cadastrarLivro(livro6)

    println("")
    println("=== As coleções ===")
    estoque1.cadastrarColecao(colecao1)
    estoque1.cadastrarColecao(colecao2)
    estoque1.cadastrarColecao(colecao3)

    println("")
    println("=== Consultando Livros ===")
    estoque1.consultarLivro(1)
    estoque1.consultarLivro(5)

    println("")
    println("=== Venda ===")
    estoque1.efetuarVenda(1)
    estoque1.efetuarVenda(2)
    estoque1.efetuarVenda(3)
    estoque1.efetuarVenda(4)
    estoque1.efetuarVenda(5)
    estoque1.efetuarVenda(6)

}