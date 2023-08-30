salario = float(input("Digite seu salário atual: "))

aumento = salario * 0.15
salarioComAumento = salario + aumento
imposto = salarioComAumento * 0.08
salarioFinal = salarioComAumento - imposto

input(f"Seu novo salário é: R$ {salarioFinal:.2f}")