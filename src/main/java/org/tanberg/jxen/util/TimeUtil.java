package org.tanberg.jxen.util;

import java.time.Instant;
import java.util.Date;

public class TimeUtil {

    public static Date fromUnixTime(int unix) {
        return Date.from(Instant.ofEpochSecond(unix));
    }

    public static int toUnixTime(Date date) {
        return (int) date.toInstant().getEpochSecond();
    }
}
