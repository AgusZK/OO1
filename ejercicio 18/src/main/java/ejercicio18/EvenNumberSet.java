package ejercicio18;

import java.util.HashSet;

// Heredo de Set el HashSet y los demas metodos, solo modifico Add
public class EvenNumberSet<Integer> extends HashSet<Integer> {
    public boolean add (Integer num){
        if ((int)num % 2 == 0){
            return super.add(num);
        }
        else {
            return false;
        }
    }
    // Preguntar por implementar interfaz de 'Set'
    // Y escribir todos los metodos modificando solo 'Add' para que funcione
}
