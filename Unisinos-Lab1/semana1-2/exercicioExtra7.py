pao = int(input("Digite a quantidade de pães vendidos no dia: "))
broa = int(input("Digite a quantidade de broas vendidas no dia: "))

paoLucro = pao * 0.5
broaLucro = broa * 2
lucroTotal = paoLucro + broaLucro

print(f"Valor recebido com as vendas dos pães: R${paoLucro:.2f} \n"
      f"Valor recebido com as vendas das broas: R${broaLucro:.2f} \n"
      f"Valor total recebido com as vendas: R${lucroTotal:.2f}")