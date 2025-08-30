# 5 – F.U.P que leia as notas de alunos até que o usuário digite uma nota
# negativa. Armazene as notas em uma lista. No final do programa deverá
# mostrar:
#  A soma total das notas
#  A média das notas
#  A maior e menor nota

lista = []

maior = 0
menor = 0
cont = 1
while True:
    num = float(input(f"Insira a {cont}° nota: "))
    if num <0:
        break
    else:
        lista.append(num)
    if cont == 1:
        maior = num
        menor = num
    elif num > maior:
        maior = num
    elif num < menor:
        menor = num
    cont +=1
    
print(f"A soma total das nota é {sum(lista):.2f}")
print(f"A média de todas as notas é {sum(lista)/len(lista):.2f}")
print(f"A menor nota foi: {menor}")
print(f"A maior nota foi: {maior}")