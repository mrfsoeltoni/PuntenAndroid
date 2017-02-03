package id.punten.base_java;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by fathan on 04/02/17.
 */

public class DefaultObserver<T> extends DisposableObserver<T> {
    @Override public void onNext(T t) {
        // no-op by default.
    }

    @Override public void onComplete() {
        // no-op by default.
    }

    @Override public void onError(Throwable exception) {
        // no-op by default.
    }
}