# Usa una imagen base de Python
FROM python:3.9-alpine  

# Establece el directorio de trabajo en el contenedor
WORKDIR /app  

# Instala las dependencias necesarias
RUN pip install sympy  

# Copia el script de Python al contenedor
COPY solucion.py .  

# Especifica el comando para ejecutar el script
CMD ["python", "solucion.py"]

