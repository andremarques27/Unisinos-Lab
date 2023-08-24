moedas1Cent = int(input("Digite a quantidade de moedas de 1 centavo: "))
moedas5Cent = int(input("Digite a quantidade de moedas de 5 centavos: "))
moedas10Cent = int(input("Digite a quantidade de moedas de 10 centavos: "))
moedas25Cent = int(input("Digite a quantidade de moedas de 25 centavos: "))
moedas50Cent = int(input("Digite a quantidade de moedas de 50 centavo: "))
moedas1Real = int(input("Digite a quantidade de moedas de 1 real: "))

valor1Cent = moedas1Cent * 0.01
valor5Cent = moedas5Cent * 0.05
valor10Cent = moedas10Cent * 0.10
valor25Cent = moedas25Cent * 0.25
valor50Cent = moedas50Cent * 0.50

valorFinal = valor1Cent + valor5Cent + valor10Cent + valor25Cent + valor50Cent + moedas1Real

print("O valor economizado é:", valorFinal)