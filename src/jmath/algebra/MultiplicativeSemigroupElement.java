package jmath.algebra;

public interface MultiplicativeSemigroupElement<M extends MultiplicativeSemigroupElement<M>> extends MultiplicativeMagmaElement<M> {

    default M multiplies(M[] others) {
        @SuppressWarnings("unchecked")
        M result = (M) this;
        for (M other : others) {
            result = result.multiply(other);
        }
        return result;
    }

}
