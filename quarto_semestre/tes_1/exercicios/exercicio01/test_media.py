# test_media.py
from media import calcular_media_ponderada

def test_media_ponderada_sucesso():
    # CT01: Entrada: nota1=6.0, nota2=8.0 | Resultado Esperado: 7.2
    assert calcular_media_ponderada(6.0, 8.0) == 7.2

def test_media_ponderada_valores_limites():
    # CT02: Entrada: nota1=0.0, nota2=10.0 | Resultado Esperado: 6.0
    assert calcular_media_ponderada(0.0, 10.0) == 6.0