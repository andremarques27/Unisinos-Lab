usuario = input("Digite seu usuario: ")
senha = input("Digite sua senha: ")


while usuario != "user10" and senha != "password1234":
    print("-------------------------------- \n"
          "Usuario ou senha incorretos \n"
          "Digite o login novamente:")
    
    usuario = input("Digite seu usuario: ")
    senha = input("Digite sua senha: ")

print("Loging efetuado com sucesso!")