package jmath.algebra;

public interface CommutativeQuasigroupElement<M extends CommutativeQuasigroupElement<M>> extends CommutativeMagmaElement<M>, MultiplicativeQuasigroupElement<M> {

    default M leftDivide(M other) {
        @SuppressWarnings("unchecked")
        M self = (M) this;
        return other.divide(self);
    }

}
