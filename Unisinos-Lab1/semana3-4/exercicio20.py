numProdutos = int(input("Digite quantos itens terá na lista de compra: "))
numero = 1
produtos = []

while numero <= numProdutos:
    produto = input("Digite o nome do produto: ")
    produtos.append(produto)
    numero += 1
    
print(produtos)