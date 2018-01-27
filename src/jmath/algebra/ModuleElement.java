package jmath.algebra;

public interface ModuleElement<M extends ModuleElement<M, R>, R extends RingElement<R> & CommutativeGroupElement<R>>
        extends LeftModuleElement<M, R>, RightModuleElement<M, R> {

    M scalarMultiply(R scalar);

}
