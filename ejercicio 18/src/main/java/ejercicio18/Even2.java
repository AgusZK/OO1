package ejercicio18;

import java.util.*;

public class Even2<Integer> implements Set<Integer> {
    private Set<Integer> set;

    public Even2(){
        set = new HashSet<Integer>();
    }

    // Modifico Add
    @Override
    public boolean add(Integer num) {
        if ((int)num % 2 == 0 && !this.set.contains(num)){
            set.add(num);
            return true;
        }
        else {
            return false;
        }
    }

    // Declaro todos los metodos de Set
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;
        for (Integer number : c) {
            if (number != null && (int)number % 2 == 0) {
                if (set.add(number)) {
                    modified = true;
                }
            }
        }
        return modified;
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override
    public boolean equals(Object o) {
        return set.equals(o);
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }
}