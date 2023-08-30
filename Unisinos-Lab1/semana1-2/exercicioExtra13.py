camisas = int(input("Digite o número de camisas compradas: "))
calcas = int(input("Digite o número de calcas compradas: "))
cintos = int(input("Digite o número de cintos compradas: "))

valorCamisas = camisas * 25
valorCalcas = calcas * 100
valorCintos = cintos * 40

valorFinal = valorCamisas + valorCalcas + valorCintos
valorDesconto = valorFinal * 0.10
valorFinalDesc = valorFinal - valorDesconto

print(f"O valor dos produtos é: R${valorFinal:.2f} \n"
      f"O valor do desconto é: R${valorDesconto:.2f} \n"
      f"O valor da compra é: R${valorFinalDesc:.2f}")