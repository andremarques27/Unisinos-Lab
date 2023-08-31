def primoOuNao(num):
    if num == 2 or num == 3 or num == 5 or num == 7:
        return f"O número {num} é primo."
        
    if num <= 1 or num % 2 == 0 or num % 3 == 0 or num % 5 == 0 or num % 7 == 0:
        return f"O número {num} não é primo."
    else:
        return f"O número {num} é primo."
    
num = int(input("Digite um número: "))

print(f"{primoOuNao(num)}")