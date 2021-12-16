package sort_manager.utils;

public class Timer {
    private long startTime;
    private long endTime;

    public long getTimeDiff() {
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
