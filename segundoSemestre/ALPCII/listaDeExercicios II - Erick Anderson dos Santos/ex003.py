# 3 – F.U.P que peça a idade de várias pessoas e classifique-as como "Criança"
# (0 a12), "Adolescente" (13 a 17), "Adulto" (18 a 59) ou "Idoso" (60+). Use
# funções, if/elif/else e listas. No final a saída seria assim:

def idade(num=0):
    if num >= 0 and num <= 12:
        return "Criança"
    elif num >= 13 and num <= 17:
        return "Adolescente"
    elif num >= 18 and num <= 59:
        return "Adulto"
    elif num >= 60:
        return "Idoso"

idades = []

cont = 1
print("Cadastro de idade (digite 0 para encerrar): ")
while True:
    pessoa = int(input(f"Insira a {cont}° idade: "))
    
    if pessoa == 0:  
        break
    
    idades.append(pessoa)
    cont += 1

print("\nClassificação das idades:")
for p in idades:
    print(f"Idade {p}: {idade(p)}")
