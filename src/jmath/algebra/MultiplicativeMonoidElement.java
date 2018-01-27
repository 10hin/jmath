package jmath.algebra;

public interface MultiplicativeMonoidElement<M extends MultiplicativeMonoidElement<M>> extends MultiplicativeSemigroupElement<M> {

    boolean isLeftOne();
    boolean isRightOne();

}
