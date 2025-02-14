use std::time::Instant;

fn es_primo(n: u64) -> bool {
    if n <= 1 { return false; }
    for i in 2..=((n as f64).sqrt() as u64) {
        if n % i == 0 {
            return false;
        }
    }
    true
}

fn main() {
    let inicio = Instant::now();
    let mut suma: u64 = 0;
    let mut contador = 0;
    let mut n = 2;

    while contador < 900000 {
        if es_primo(n) {
            suma += n;
            contador += 1;
        }
        n += 1;
    }

    let suma_es_primo = es_primo(suma);
    let duracion = inicio.elapsed();

    println!("La suma de los primeros 900,000 primos es: {}", suma);
    println!("La suma es prima: {}", if suma_es_primo { "Si" } else { "No" });
    println!("Tiempo: {:.2?}", duracion);
}
