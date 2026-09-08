# test_hello.py
def soma(a, b):
    return a + b

def test_soma_simples():
    # Oráculo: a soma de 5 + 10 deve resultar em exatamente 15.
    assert soma(5, 10) == 15