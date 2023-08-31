def soma(num1, num2):
    return num1 + num2

def subtrai(num1, num2):
    return num1 - num2

def multiplica(num1, num2):
    return num1 * num2

def divide(num1, num2):
    return num1 / num2

def potencia(num1, num2):
    return num1 ** num2
    
def raiz(num1, num2):
    return num1 ** (1/num2)
    

lerTeclado = int(input("Digite 1 para somar dois valores. \n"
                       "Digite 2 para subtrair dois valores. \n"
                       "Digite 3 para multiplicar dois valores. \n"
                       "Digite 4 para dividir dois valores. \n"
                       "Digite 5 para potencializar dois valores. \n"
                       "Digite 6 para radializar dois valores. \n"
                       "Digite qualquer outra tecla para sair do programa. \n"
                       "Esperendo... "))

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

if lerTeclado == 1:
    resultado = soma(num1, num2)
    print(f"O resultado da soma dos dois números é: {resultado:.0f}")
elif lerTeclado == 2:
    resultado = subtrai(num1, num2)
    print(f"O resultado da subtração dos dois números é: {resultado:.0f}")
elif lerTeclado == 3:
    resultado = multiplica(num1, num2)
    print(f"O resultado da multiplicação dos 2 números é: {resultado:.0f}")
elif lerTeclado == 4:
    resultado = divide(num1, num2)
    print(f"O resultado da divisão dos dois valores é: {resultado:.2f}")
elif lerTeclado == 5:
    resultado = potencia(num1, num2)
    print(f"O resultado da potenciação é: {resultado:.0f}")
elif lerTeclado == 6:
    resultado = raiz(num1, num2)
    print(f"O resultado da radiação é: {resultado:.2f}")
else:
    print("Programa finalizado!")