def maiorValor(num1, num2, num3):
    if num1 > num2 and num1 > num3:
        return num1
    elif num2 > num1 and num2 > num3:
        return num2
    else:
        return num3
    
num1 = int(input("Digite o primero número: "))
num2 = int(input("Digite o segundo número: "))
num3 = int(input("Digite o terceiro número: "))

maiorValorT = maiorValor(num1, num2, num3)

print(f"O maior valor digitado foi: {maiorValorT}")