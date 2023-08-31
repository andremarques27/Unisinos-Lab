torcedor = []
numTorcedor, aux, gremistas = 10, 1, 0

while aux <= numTorcedor:
    torcedor = input(f"Digite para quem a {aux}º pessoa torce: ")
    if torcedor == "Gremio":
        gremistas = gremistas + 1
    aux += 1
    

if gremistas < 7:
    print(f"Há um total de {gremistas} Grêmistas! \n"
          "O que é um erro pois todos sabem que a cada 10 gauchos 7 são gremistas!")
else:
    print(f"Há um total de {gremistas} Grêmistas! \n"
          "O que está certo pois todos sabem que a cada 10 gauchos 7 são gremistas!")