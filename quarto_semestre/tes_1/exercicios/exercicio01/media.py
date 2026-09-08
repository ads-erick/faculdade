# No Exercício 1, foi identificado um defeito em um programa que usava o divisor estático '6' em vez da
# soma real dos pesos. Veja a implementação correta no arquivo media.py

# media.py
def calcular_media_ponderada(nota1, nota2):
    # Pesos: nota1 (peso 2), nota2 (peso 3). Divisor correto = 5.
    soma_pesos = 2 + 3
    media = (nota1 * 2 + nota2 * 3) / soma_pesos
    return media