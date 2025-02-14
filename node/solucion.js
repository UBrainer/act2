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

while (contador < 900000) {
    if (esPrimo(n)) {
        suma += n;
        contador++;
    }
    n++;
}

const sumaEsPrimo = esPrimo(suma);
const fin = Date.now();

console.log(`La suma de los primeros 900,000 primos es: ${suma}`);
console.log(`La suma es prima: ${sumaEsPrimo ? 'Si' : 'No'}`);
console.log(`Tiempo: ${(fin - inicio) / 1000} segundos`);
