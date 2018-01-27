package jmath.algebra;

public interface LeftModuleElement<M extends LeftModuleElement<M, R>, R extends RingElement<R>>
        extends AdditiveGroupElement<M> {

    M leftScalarMultiply(R scalar);

}
