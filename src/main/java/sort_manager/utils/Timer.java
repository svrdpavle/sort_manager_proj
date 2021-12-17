package sort_manager.utils;

/**
 * This class is used to manage and manipulate the time
 */
public class Timer {
    private long startTime;
    private long endTime;

    /**
     * Gets the time difference after completing a simple subtraction
     * @return time difference
     */
    public long getTimeDiff() { return endTime - startTime; }

    /**
     * Get the start time
     * @return the start time
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * Set the start time
     * @param startTime time at the start
     */
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the end time
     * @return the end time
     */
    public long getEndTime() {
        return endTime;
    }

    /**
     * Set the end time
     * @param endTime time at the end
     */
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
