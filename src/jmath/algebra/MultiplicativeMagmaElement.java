package jmath.algebra;

import jmath.ClassifiedElement;

public interface MultiplicativeMagmaElement<M extends MultiplicativeMagmaElement<M>> extends ClassifiedElement<M> {

    M multiply(M other);
    M leftMultiply(M other);

}
