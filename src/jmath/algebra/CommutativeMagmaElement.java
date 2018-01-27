package jmath.algebra;

public interface CommutativeMagmaElement<M extends CommutativeMagmaElement<M>> extends MultiplicativeMagmaElement<M> {

    @Override
    default M leftMultiply(M other) {
        return self().multiply(other);
    }

}
