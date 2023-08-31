for tentativas in range(0,3):
    usuario = input("Digite seu usuario: ")
    senha = input("Digite sua senha: ")

    if usuario != "user10" and senha != "password1234":
        print("-------------------------------- \n"
            "Usuario ou senha incorretos \n"
            "Digite o usuario e senha novamente:")
    else:
         print("Loging efetuado com sucesso!")
         exit()

print("Números de tentativas de login excedido, acesso bloquedo!")