peso = float(input("Peso do prato: "))

pesoPorKg = 45.0
pesoPorG = peso / 1000.0
valor = pesoPorKg * pesoPorG

print(f"Valor a pagar: R$ {valor:.2f}")