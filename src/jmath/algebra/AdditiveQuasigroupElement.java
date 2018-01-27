package jmath.algebra;

public interface AdditiveQuasigroupElement<A extends AdditiveQuasigroupElement<A>> extends AdditiveMagmaElement<A> {

    A subtract(A other);

}
