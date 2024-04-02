package encapsulation;

import java.time.LocalDateTime;
import java.time.Duration;
/**
 *
 * @author alissais
 */
public class stopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Konstruktor tanpa argumen
    public stopWatch() {
        this.startTime = LocalDateTime.now();
    }

    // Getter untuk startTime
    public LocalDateTime getStartTime() {
        return startTime;
    }

    // Getter untuk endTime
    public LocalDateTime getEndTime() {
        return endTime;
    }

    // Metode start()
    public void start() {
        this.startTime = LocalDateTime.now();
    }

    // Metode stop()
    public void stop() {
        this.endTime = LocalDateTime.now();
    }

    // Metode getElapsedTime()
    public long getElapsedTime() {
        if (endTime == null) {
            return -1; // Indikasi bahwa stopwatch belum dihentikan
        }
        return Duration.between(startTime, endTime).toMillis();
    }
}
