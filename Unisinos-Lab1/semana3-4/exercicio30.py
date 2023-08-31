solteiras = []
casadas = []
divorciadas = []
viuvas = []

for pessoa in range(1,21):
    nome = input("Digite o nome: ")
    estadoCivil = input("Digite o estado civil: ")

    if estadoCivil == "solteiro" or estadoCivil == "solteira":
        solteiras.append(nome)
    elif estadoCivil == "casado" or estadoCivil == "casada":
        casadas.append(nome)
    elif estadoCivil == "divorciado" or estadoCivil == "divorciada":
        divorciadas.append(nome)
    elif estadoCivil == "viuvo" or estadoCivil == "viuva":
        viuvas.append(nome)
    else:
        print("estado civil invalido!")

print(f"Pessoas solteiras: {solteiras} \n"
      f"Pessoas casadas: {casadas} \n"
      f"Pessoas divorciadas: {divorciadas} \n"
      f"Pessoas viuvas: {viuvas}")