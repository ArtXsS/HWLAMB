package Worker;
public class Worker{
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 66; i++) {
            while (i < 33) {
                callback.onDone("Task " + (i + 1 )+ " is done");
                i++;
            }
            errorCallback.onError("Task " + (i + 1) + " is error");
        }
    }
}
