package ch03.ex04;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();

    static IntSequence of(int... sequence){
        return new IntSequence() {
            int pos = 0;

            @Override
            public boolean hasNext(){
                return pos < sequence.length;
            }
            @Override
            public int next() {
                pos++;
                return sequence[pos - 1];
            }
        };
    }
}