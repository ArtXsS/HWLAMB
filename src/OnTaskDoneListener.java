package worker.src;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
