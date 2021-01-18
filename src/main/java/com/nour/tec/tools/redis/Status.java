package com.nour.tec.tools.redis;

import java.util.concurrent.TimeUnit;

/**
 * @author Xubo
 * @date 2021/1/18 17:58
 */
public abstract class Status {
    public static enum ExpireEnum{
        UNREAD_MSG(30L, TimeUnit.DAYS);

        private Long time;
        private TimeUnit timeUnit;

        ExpireEnum(Long time,TimeUnit timeUnit){
            this.time = time;
            this.timeUnit = timeUnit;
        }

        public Long getTime (){
            return time;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }
    }
}
