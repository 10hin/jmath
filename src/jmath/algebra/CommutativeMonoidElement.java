package jmath.algebra;

public interface CommutativeMonoidElement<M extends CommutativeMonoidElement<M>> extends MultiplicativeMonoidElement<M>, CommutativeSemigroupElement<M> {

    @Override
    default boolean isLeftOne() {
        return self().isOne();
    }
    @Override
    default boolean isRightOne() {
        return self().isOne();
    }
    boolean isOne();
    @Override
    default M multiplies(M[] others) {
        return CommutativeSemigroupElement.super.multiplies(others);
    }

}
