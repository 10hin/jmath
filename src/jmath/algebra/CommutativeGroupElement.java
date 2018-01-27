package jmath.algebra;

public interface CommutativeGroupElement<M extends CommutativeGroupElement<M>> extends CommutativeLoopElement<M>, CommutativeMonoidElement<M>, MultiplicativeGroupElement<M> {

    @Override
    default M leftInvert() {
        return self().invert();
    }
    @Override
    default M rightInvert() {
        return self().invert();
    }
    M invert();

}
