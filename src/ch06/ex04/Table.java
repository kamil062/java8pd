package ch06.ex04;

import java.util.ArrayList;
import java.util.Arrays;

public class Table<K, V> {
    class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }

        @Override
        public String toString() {
            return "[" + this.key + " : " + this.value + "]";
        }
    }
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
