FROM rust:latest
WORKDIR /app

# Copiar archivos
COPY solucion.rs .
RUN rustc solucion.rs -o solucion

CMD ["./solucion"]
