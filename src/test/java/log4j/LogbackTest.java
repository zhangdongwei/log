package log4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangdongwei
 * @create 2020-02-06-11:44
 */
public class LogbackTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void logbackTest() {
        for (int i = 0; i < 10000; i++) {
            //日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");  //logback默认级别
            LOGGER.trace("trace");
        }
    }

}
