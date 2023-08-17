a = int(input("Digite o valor de A: "))
b = int(input("Digite o valor de B: "))
c = int(input("Digite o valor de C: "))

x1 = (-b - (b ** 2 - 4 * a * c) ** (1/2)) / 2 * a
x2 = (-b + (b ** 2 - 4 * a * c) ** (1/2)) / 2 * a

print("resultado negativo: ", x1, "\n"
      "resultado posistivo: ", x2)