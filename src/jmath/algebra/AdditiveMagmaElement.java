package jmath.algebra;

import jmath.ClassifiedElement;

public interface AdditiveMagmaElement<A extends AdditiveMagmaElement<A>> extends ClassifiedElement<A> {

    A add(A other);

}
