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

    while contador < 9000 {
        if es_primo(n) {
            suma += n;
            contador += 1;
        }
        n += 1;
    }

    let duracion = inicio.elapsed();

    println!("{:.2}", duracion.as_secs_f64());
}
