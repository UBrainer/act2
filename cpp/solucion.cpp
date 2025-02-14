#include <iostream>
#include <cmath>
#include <chrono>

bool esPrimo(long long n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (long long i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
}

int main() {
    auto inicio = std::chrono::high_resolution_clock::now();

    long long suma = 0;
    int contador = 0;
    for (long long i = 2; contador < 900000; ++i) {
        bool primo = true;
        for (long long j = 2; j * j <= i; ++j) {
            if (i % j == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            suma += i;
            contador++;
        }
    }

    bool sumaEsPrimo = true;
    for (long long i = 2; i * i <= suma; ++i) {
        if (suma % i == 0) {
            sumaEsPrimo = false;
            break;
        }
    }

    auto fin = std::chrono::high_resolution_clock::now();
    std::chrono::duration<double> duracion = fin - inicio;

    std::cout << "La suma de los primeros 900,000 primos es: " << suma << "\n";
    std::cout << "La suma es prima: " << (sumaEsPrimo ? "Si" : "No") << "\n";
    std::cout << "Tiempo: " << duracion.count() << " segundos\n";
    
    return 0;
}

