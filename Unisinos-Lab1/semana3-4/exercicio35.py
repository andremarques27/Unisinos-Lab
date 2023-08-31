def somaValores(num):
 soma = 0
 for i in range(0,num+1): 
    soma += i
 return soma


num = int(input("Digite um número: "))

resultado = somaValores(num)

print(f"A soma dos valores até {num} é {resultado}")