package worker2.src;
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
