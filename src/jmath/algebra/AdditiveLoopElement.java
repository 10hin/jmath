package jmath.algebra;

public interface AdditiveLoopElement<A extends AdditiveLoopElement<A>> extends AdditiveQuasigroupElement<A> {

    boolean isZero();

}
