package jmath.algebra;

public interface AdditiveSemigroupElement<A extends AdditiveSemigroupElement<A>> extends AdditiveMagmaElement<A> {

    default A adds(A[] others) {
        A result = self();
        for (A other : others) {
            result = result.add(other);
        }
        return result;
    }

}
