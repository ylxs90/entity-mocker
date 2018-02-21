package io.hxiao.mocker.spi;

@FunctionalInterface
public interface Adapter<P, R> {

    @SuppressWarnings("unchecked")
    static <P, R> Adapter<P, R> defaultAdapter() {
        return a -> (R) a;
    }

    R adapt(P param);
}
