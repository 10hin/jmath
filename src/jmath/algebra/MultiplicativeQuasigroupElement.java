package jmath.algebra;

public interface MultiplicativeQuasigroupElement<M extends MultiplicativeQuasigroupElement<M>> extends MultiplicativeMagmaElement<M> {

    M divide(M other);
    M leftDivide(M other);

}
