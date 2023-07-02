package worker2.src;
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
