precoGasolina = float(input("Digite o valor da gasolina: "))
dinheroDisponivel = float(input("Digite o valor disponivel: "))

litrosComprado = dinheroDisponivel / precoGasolina  

print(f"Foi colocado {litrosComprado:.2f} litros de gasolina no tanque.")