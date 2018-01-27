package jmath.algebra;

public interface MultiplicativeLoopElement<M extends MultiplicativeLoopElement<M>> extends MultiplicativeQuasigroupElement<M> {

    boolean isLeftOne();
    boolean isRightOne();

}
