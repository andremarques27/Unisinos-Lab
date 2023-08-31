num = int(input("Digite um número: "))

if num == 2 and num == 3 and num == 5 and num == 7:
    print(f"O número {num} é primo.")
elif num <= 1 or num % 2 == 0 or num % 3 == 0 or num % 5 == 0 or num % 7 == 0:
    print(f"O número {num} não é primo.")
else:
    print(f"O número {num} é primo.")