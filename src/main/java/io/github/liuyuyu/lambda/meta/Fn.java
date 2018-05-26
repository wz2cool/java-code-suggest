package io.github.liuyuyu.lambda.meta;

import java.io.Serializable;

/**
 * @author Frank
 */
@FunctionalInterface
public interface Fn<T> extends Serializable {
    Object apply(T source);
}
