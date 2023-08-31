def divisivel(num1, num2):
    if num1 % num2 == 0:
        return True
    else:
        return False
    
num1 = int(input("Digite o primero número: "))
num2 = int(input("Digite o segundo número: "))

reultado = divisivel(num1, num2)

print(f"A resposta é: {reultado}")