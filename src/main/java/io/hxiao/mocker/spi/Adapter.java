package io.hxiao.mocker.spi;

@FunctionalInterface
public interface Adapter<P, R> {

    static Adapter defaultAdapter() {
        return a -> a;
    }

    R adapt(P param);
}
