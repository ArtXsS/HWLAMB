public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for(int i = 0; i < 33; i++) {
            callback.onDone("Task " + (i + 1) + " is done");
        }
    }
    public void startError() {
        for(int i = 0; i < 33; i++) {
            errorCallback.onError("Task " + (i + 1) + " is error");
        }
    }
}
