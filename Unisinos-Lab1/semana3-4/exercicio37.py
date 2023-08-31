def menorTexto(lista = []):
    menor = -1
    for i in lista:
        if(menor == -1):
            menor = i
        elif(len(i) < len(menor)):
            menor = i
    return menor

    
lista = ["arroz", "ovo", "leite", "feijão", "macarrao"]

menor = menorTexto(lista)

print(f"A menor string da lista é: {menor}")    