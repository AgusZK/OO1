package ejerParcial2;

/*

  Clase Plan:
    -Metodo: calcularPenalizacion(periodo Date):Real
    Casos:
    1) El plan es individual y la cantidad de ips es > 1
    2) El plan es individual y la cantidad de ips es = 1
    3) EL plan es grupal y la cantidad de ips es mayor a la establecida en el plan
    AGREGAR CASO EN EL QUE SON IGUALES
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