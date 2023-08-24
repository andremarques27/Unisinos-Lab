valorCompra = float(input("Digite o valor da compra: "))

valorDesconto = valorCompra * 0.15
valorFinal = valorCompra - valorDesconto

print(f"O valo do desconto é: {valorDesconto} \n"
      f"O valor final com desconto é: {valorFinal}")