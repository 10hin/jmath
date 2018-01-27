package jmath.algebra;

public interface MultiplicativeGroupElement<M extends MultiplicativeGroupElement<M>> extends MultiplicativeLoopElement<M>, MultiplicativeMonoidElement<M> {

    M leftInvert();
    M rightInvert();

}
