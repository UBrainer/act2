import time
from sympy import primerange

# Iniciar el tiempo
start_time = time.time()

# Calcular la suma de los primeros 10,000 primos
primos = list(primerange(1, 105000))[:10000]  # Asegura obtener 10,000 primos
suma_primos = sum(primos)

# Calcular el tiempo de ejecución
elapsed_time = (time.time() - start_time) * 1000  # Milisegundos

# Guardar el resultado en un archivo
with open("output.txt", "w") as f:
    f.write(str(suma_primos))

# Imprimir solo el tiempo de ejecución
print(int(elapsed_time))