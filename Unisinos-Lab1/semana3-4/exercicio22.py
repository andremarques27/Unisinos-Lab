valor = float(input("Digite o valor do produto: "))

if valor < 100:
    juros = valor * 0.10
    valorFinal = valor + juros
    print(f"Valor inicial: {valor:.2f} \n"
          f"Valor da taxa de 10%: {juros:.2f} \n"
          f"Valor após a taxa: {valorFinal:.2f}")
elif valor >= 100 and valor < 300:
    juros = valor * 0.20
    valorFinal = valor + juros
    print(f"Valor inicial: {valor:.2f} \n"
          f"Valor da taxa de 20%: {juros:.2f} \n"
          f"Valor após a taxa: {valorFinal:.2f}")
else:
    juros = valor * 0.50
    valorFinal = valor + juros
    print(f"Valor inicial: {valor:.2f} \n"
          f"Valor da taxa de 50%: {juros:.2f} \n"
          f"Valor após a taxa: {valorFinal:.2f}")