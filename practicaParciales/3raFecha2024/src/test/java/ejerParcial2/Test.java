package ejerParcial2;

/*
Clase Cliente:
    -Metodo: montoTotalACobrar(periodo Date): Real

    Casos:
    1) El cliente tiene un plan grupal
    2) El cliente tiene un plan individual
    3) El cliente tiene una antiguedad mayor a 10 anios
    4) El cliente tiene una antiguedad menor a 10 anios
    5) El cliente tiene actividades dentro del periodo
    6) EL cliente no tiene actividades dentro del periodo

    Combinaciones posibles:
    1 con 3 o 4, 5 o 6
    2 con 3 o 4, 5 o 6
    1) Retorna 20 * minutos contratados + penalizacion si hubo
    2) Retona 800 * minutos contratados + penalizacion si hubo
    3) Retorna el calculo del monto a cobrar + 0 (no se cobra penalizacion)
    4) Retorna el calculo del monto a cobrar + penalizacion segun el tipo
    5) Reotrna el calculo del monto a cobrar + monto por actividades + penzalizacion si hubo
    6) Retorna el calculo del monto a cobrar + 0 + penalizacion si hubo

 Clase Actividad:
    -Metodo: calcularCosto():Real
    Casos:
    1) La actividad es una reprovideo
    2) La actividad es una sesionjuego y duracion <=360
    3) La actividad es una sesionjuego y duracion > 360

    Combinaciones posibles:
    1) Retorna duracionFinal * 10 por cada minuto de duracion real
    2) Retorna 0
    3) Retorna la cantidad de items * precioUnitario

  Clase Plan:
    -Metodo: calcularPenalizacion(periodo Date):Real
    Casos:
    1) El plan es individual y la cantidad de ips es > 1
    2) El plan es individual y la cantidad de ips es = 1
    3) EL plan es grupal y la cantidad de ips es mayor a la establecida en el plan
    4) El plan es grupal y la cantidad de ips es menor a la establecida en el plan
    5) El cliente tiene una antiguedad mayor a 10 anios
    6) El cliente tiene una antiguedad menor a 10 anios

    Combinaciones posibles:
    (1 o 2 o 3 o 4) con (5 o 6)

    1) Retorna cantidad de IPS * 300
    2) Retorna 0
    3) Retorna cantidad de ips - cantidad de ips contratadas * 500
    4) Retorna 0
    5) Retorna 0
    6) Retorna el resultado de penalizacion segun el tipo de plan
 */