import time

def es_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

inicio = time.time()
suma = 0
contador = 0
n = 2
while contador < 900000:
    if es_primo(n):
        suma += n
        contador += 1
    n += 1

suma_es_primo = es_primo(suma)
fin = time.time()

print(f"La suma de los primeros 900,000 primos es: {suma}")
print(f"La suma es prima: {'Si' if suma_es_primo else 'No'}")
print(f"Tiempo: {fin - inicio:.2f} segundos")
