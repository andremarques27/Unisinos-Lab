def divNum(num, num2):
    return num / num2

num = int(input("Digite o primero número: "))
num2 = int(input("Digite o segundo número: "))

if num2 == 0:
    print("O segundo número não pode ser 0!")
else:
    resultado = divNum(num, num2)
    print(f"O resultado da divisão dos números é: {resultado}")