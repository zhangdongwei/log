package log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author zhangdongwei
 * @create 2020-02-05-19:58
 */
public class Log4jTest {

    @Test
    public void testQuick() {

        //初始化配置信息，暂不适用配置文件，适用Log4j的默认配置
//        BasicConfigurator.configure();

        Logger logger = Logger.getLogger(Log4jTest.class);
        logger.info("hello log4j");

        for (int i = 0; i < 10000; i++) {
            //日志级别
            logger.fatal("fatal");

            logger.error("error");
            logger.warn("warn");
            logger.info("info");
            logger.debug("debug");

            logger.trace("trace");
        }
    }

}
