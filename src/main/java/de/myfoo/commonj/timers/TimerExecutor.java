/**
 * #(@) TimerExecutor.java Aug 16, 2006
 */
package de.myfoo.commonj.timers;

/**
 * Timer executor.
 *
 * @author Andreas Keldenich
 */
final class TimerExecutor implements Runnable {

    private boolean running = false;
    private FooTimer timer;

    /**
     * Creates a new instance of TimerExecutor.
     */
    public TimerExecutor(FooTimer timer) {
        this.timer = timer;
    }

    /**
     * run method to execute a timer
     */
    public void run() {

        running = true;
        try {
            // execute the timer
            timer.execute();
            // compute next execution time
            timer.computeNextExecutionTime();

        } catch (Exception e) {
            // ignore
        } finally {
            running = false;
        }
    }

    /**
     * Getter for timer
     *
     * @return Returns the timer.
     */
    public FooTimer getTimer() {
        return timer;
    }

    /**
     * Is timer running
     *
     * @return <code>true</code> if timer is running
     */
    public boolean isRunning() {
        return running;
    }
}
