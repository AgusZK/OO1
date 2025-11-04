package ejerParcial;

/* Clase Entrada:
     -Metodo calcular devolucion():Real
         -Casos:
            1) La diferencia de dias entre fecha de compra y fecha de evento es < 30
            2) La diferencia de dias entre fecha de compra y fecha de evento es = 30
            3) La diferencia de dias entre fecha de compra y fecha de evento es > 30
            4) La entrada fue comprada sin seguro de reembolso
            5) La entrada fue comprada con seguro de reembolso

       -Combinaciones posibles:
            1 con 4 y 5
            2 con 4 y 5
            3 con 4 y 5

         -1) Retorna 0 + devolucion dependiendo si tiene seguro o no
         -2) Retorna 50% del precio de asistencia + devolucion si tiene seguro o no
         -3) Retorna 50% del precio de asistencia + devolucion si tiene seguro o no
         -4) Retorna lo que devuelva el checkeo de la diferencia de dias + 0 (sin recargo)
         -5) Retorna lo que devuelva el checkeo de la diferencia de dias + 15% del precio de asistencia


    Clase Evento:
        -Metodo precioAsistecnia(fecha: Date):Real

        -Casos:
            6) El evento es virtual y la fecha de consulta coincide con la fecha de evento
            7) EL evento es virtual y la fecha de consulta no coincide con la fecha de evento
            8) El evento es presencial y la fecha de consulta coincide con la fecha de evento
            9) EL evento es presencial y la fecha de consulta no coincide con al fecha de evento

        -6) Retorna precio de inscripcion + precio remera + montoFijo + recargo del 20% del precio de inscripcion
        -7) Retorna precio de inscripcion + precio remera + montoFijo (sin recargo)
        -8) Retorna precio de inscrpcion + precio remera + suma total de los precios de las sedes + recargo del 20% del precio de inscrpcion
        -9) retorna precio de inscrpcion + precio remera + suma total de los precios de las sedes (sin recargo)

    Clase sede: TODOS LOS METODOS QUE NO SEAN GETTER/SETTER TESTEARLOS
*/

