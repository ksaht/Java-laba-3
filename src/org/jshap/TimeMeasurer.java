package org.jshap;

/**
 * Класс замера времени
 */
public final class TimeMeasurer {
    /**
     * Метод, возвращающий время выполнения операции
     */
    public static long timing (Runnable fun) {
        long beginTime = System.currentTimeMillis();

        fun.run();

        return System.currentTimeMillis() - beginTime;
    }
}