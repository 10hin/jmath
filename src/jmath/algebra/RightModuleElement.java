package jmath.algebra;

public interface RightModuleElement<M extends RightModuleElement<M, R>, R extends RingElement<R>> extends AdditiveGroupElement<M> {

    M rightScalarMultiply(R scalar);

}
