package jmath.algebra;

public interface CommutativeLoopElement<M extends CommutativeLoopElement<M>> extends MultiplicativeLoopElement<M>, CommutativeQuasigroupElement<M> {

    @Override
    default boolean isLeftOne() {
        return self().isOne();
    }
    @Override
    default boolean isRightOne() {
        return self().isOne();
    }
    boolean isOne();

}
