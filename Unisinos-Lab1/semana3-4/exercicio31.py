for tentativas in range(0,6):
    senha = input("Defina uma senha de 5 à 10 números: ")

    if senha.isdigit() and len(senha) >= 5 and len(senha) <= 10:
        print("Senha cadastrada com sucesso!")
        exit()
    else:
        print("Senha invalida")

print("Limite de tentativas excedida!")