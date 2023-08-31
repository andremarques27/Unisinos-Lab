texto = input("Digite o texto:")
quantVogais = 0
vogais = ["a","e","i","o","u","A","E","I","O","U"]

for i in texto:
    for j in vogais:
        if(i == j):
            quantVogais += 1

print(quantVogais)