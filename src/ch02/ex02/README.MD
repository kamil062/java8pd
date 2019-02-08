### Przyjrzyj się metodzie nextInt z klasy Scanner . Czy jest to metoda dostępowa,
czy modyfikująca? Dlaczego? A jak jest z metodą nextInt z klasy Random?

Scanner.nextInt jest metodą modyfikującą, ponieważ modyfikuje dane obiektu:

```java
public int nextInt(int radix) {
    ...
    setRadix(radix);
    clearCaches();
    ...
}
```

Random.nextInt jest metodą dostępową, ponieważ obliczenia nie modyfikują stanu obiektu.

```java
public int nextInt() {
    return next(32);
}

protected int next(int bits) {
    long oldseed, nextseed;
    AtomicLong seed = this.seed;
    do {
        oldseed = seed.get();
        nextseed = (oldseed * multiplier + addend) & mask;
    } while (!seed.compareAndSet(oldseed, nextseed));
    return (int)(nextseed >>> (48 - bits));
}
```