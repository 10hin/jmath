package jmath.algebra;

public interface AdditiveGroupElement<A extends AdditiveGroupElement<A>> extends AdditiveLoopElement<A>, AdditiveMonoidElement<A> {

    A negate();

}
