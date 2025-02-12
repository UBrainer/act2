FROM golang:latest
WORKDIR /app

# Inicializa un módulo de Go antes de compilar
RUN go mod init app

COPY solucion.go .
RUN go build -o solucion solucion.go

CMD ["./solucion"]

