garrafa330ml = int(input("Digite quantas garrafas de 330ml foram compradas: "))
garrafa750ml = int(input("Digite quantas garrafas de 750ml foram compradas: "))
garrafa1_3L = int(input("Digite quantas garrafas de 1,3 litros foram compradas: "))

garrafa330 = garrafa330ml * 0.330
garrafa750 = garrafa750ml * 0.750
garrafa1_3 = garrafa1_3L * 1.3
litrosComprados = garrafa330 + garrafa750 + garrafa1_3

print(f"Total de litros comprados: {litrosComprados:.2f}")