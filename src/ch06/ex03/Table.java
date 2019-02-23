package ch06.ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class Table<K, V> {
    private ArrayList<Entry<K, V>> table = new ArrayList<>();

    public void add(K key, V value){
        this.table.add(new Entry<K, V>(key, value));
    }

    public Entry<K, V> remove(K key){
        Entry<K, V> ret = null;
        for(Entry<K, V> e : this.table) {
            if (e.getKey().equals(key)) {
                ret = e;
                this.table.remove(e);
                break;
            }
        }

        return ret;
    }

    public Entry<K, V> get(K key){
        Entry<K, V> ret = null;
        for(Entry<K, V> e : this.table) {
            if (e.getKey().equals(key)) {
                ret = e;
                break;
            }
        }

        return ret;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.table.toArray());
    }
}
