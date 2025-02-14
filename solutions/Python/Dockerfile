# Usamos una imagen oficial de Python optimizada
FROM python:3.10-slim

# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el script de Python y los archivos necesarios al contenedor
COPY solution.py . 

# Instalamos cualquier dependencia si es necesario (descomenta si usas librerías adicionales)
# RUN pip install -r requirements.txt

# Comando para ejecutar el script y guardar la salida
CMD ["python", "solution.py"]
