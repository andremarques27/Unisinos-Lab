praticaA = float(input("Digite a nota da atividade prática de Grau A: "))
teoricaA = float(input("Digite a nota da atividade teórica de Grau A: "))
laboratorioB = float(input("Digite a nota da prava em laboratório de Grau B: "))
teoricaB = float(input("Digite a nota do teste teórico de Grau B: "))
extraclasse = float(input("Digite a nota do trabalho extraclasse de Grau B: "))

grauA = (praticaA * 0.45) + (teoricaA * 0.55)
grauB = (laboratorioB * 0.6) + (teoricaB * 0.2) + (extraclasse * 0.2)
notaFinal = (grauA * 0.33) + (grauB * 0.67)

print(" Nota final do Grau A: ", grauA, "\n"
        "Nota final do Grau B:", grauB, "\n"
            "Nota final:", notaFinal)