## Jaki jest typ nadrzędny dla typu `String`? Dla typu `Scanner`? Typu `ImageOutputStream`? Zauważ, że każdy typ ma typ nadrzędny. Klasa lub interfejs bez zadeklarowanego typu nadrzędnego otrzymuje jako typ nadrzędny `Object`.

### `String implements java.io.Serializable, Comparable<String>, CharSequence`
### `Scanner implements Iterator<String>, Closeable`
### `ImageOutputStream extends ImageInputStream, DataOutput`