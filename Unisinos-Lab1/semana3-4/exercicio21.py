valor = float(input("Digite o valor do produto: "))

if valor > 0 and valor <= 30:
    print("Preço baixo!")
elif valor > 30 and valor <= 50:
    print("Preço médio!")
elif valor > 50:
    print("Preço alto!")
else:
    print("Preço invalido!")