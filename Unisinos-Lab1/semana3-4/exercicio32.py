joioETrigo = ["joio", "trigo", "trigo", "joio", "trigo",
"joio", "joio", "joio", "joio", "trigo", "trigo", "joio",
"joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"joio", "trigo", "trigo", "joio", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "joio", "joio", "joio", "joio",
"joio", "joio", "trigo", "joio", "joio", "joio", "joio",
"joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "trigo", "trigo",
"trigo", "joio", "trigo", "joio", "joio", "joio"]
joios = []
trigos = []

for i in joioETrigo:
    if i == "joio":
        joios.append(i)
    elif i == "trigo":
        trigos.append(i)

print(f"{joios} \n"
      f"{trigos}")