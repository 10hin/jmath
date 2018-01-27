package jmath.algebra;

public interface AdditiveMonoidElement<A extends AdditiveMonoidElement<A>> extends AdditiveSemigroupElement<A> {

    boolean isZero();

}
