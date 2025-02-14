const esPrimo = (n) => {
    if (n <= 1) return false;
    for (let i = 2; i * i <= n; i++) {
        if (n % i === 0) return false;
    }
    return true;
};

const inicio = Date.now();
let suma = 0;
let contador = 0;
let n = 2;

while (contador < 9000) {
    if (esPrimo(n)) {
        suma += n;
        contador++;
    }
    n++;
}

const fin = Date.now();

console.log(`${(fin - inicio) / 1000}`);
