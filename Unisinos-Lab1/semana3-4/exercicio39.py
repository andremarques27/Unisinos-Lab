def notaFinal(nota1, nota2, nota3):
    if(nota1 >= 0 and nota2 >= 0 and nota3 >= 0):
        media = (nota1+nota2+nota3)/3
        if media <= 4:
            return "D"
        elif media <= 7:
            return "C"
        elif media <= 9:
            return "B"
        else:
            return "A"
    return "ERRO"
    
nota1 = int(input("Informe a primeira nota: "))
nota2 = int(input("Informe a segunda nota: "))
nota3 = int(input("Informe a terceira nota: "))

conceito = notaFinal(nota1, nota2, nota3)

print(f"O conceito das notas são: {conceito}")