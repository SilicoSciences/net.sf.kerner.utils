package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTaskRunnable<R, V> extends AbstractAsyncTask<R, V> implements Runnable {

    protected V value;

    public synchronized V getValue() {
        return value;
    }

    /**
     * Don't override. Override {@link #run(Object)}
     */
    public void run() {
        execute(getValue());
    }

    public synchronized void setValue(final V value) {
        this.value = value;
    }
}