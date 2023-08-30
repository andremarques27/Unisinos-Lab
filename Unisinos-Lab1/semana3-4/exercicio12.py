def somaNota(gA, gB):
    return gA * 0.3 + gB * 0.7

gA = float(input("Digite a nota do Grau A: "))
gB = float(input("Digite a nota do Grau B: "))

notaFinal = somaNota(gA, gB)

if gA < 0 or gB < 0:
    print("A nota não pode ser negativa.")
elif notaFinal < 6:
    print(f"A nota final é: {notaFinal:.2f} \n"
          "O aluno deve fazer a prava de Grau C.")
else:
    print(f"A nota final é: {notaFinal:.2f} \n"
          "O aluno não pracisa fazer a prava de Grau C.")