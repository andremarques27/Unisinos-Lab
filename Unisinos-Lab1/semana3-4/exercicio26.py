num, soma = 2, 0

while num <= 200:
    if num == 2 or num == 3 or num == 5 or num == 7:
        print(f"O número {num} é primo.")
        
    if num <= 1 or num % 2 == 0 or num % 3 == 0 or num % 5 == 0 or num % 7 == 0:
        print
    else:
        print(f"O número {num} é primo.")
    num = num + 1