package log4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhangdongwei
 * @create 2020-02-06-10:17
 */
public class Slf4jTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void slf4jTest(){

        //日志输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");   //默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        //使用占位符输出日志
        String name = "Zhangsan";
        Integer age = 21;
        LOGGER.info("name : {},age : {}", name,age);

        //用日志输出异常信息
        try {
            int i = 1/0;
        } catch (Exception e) {
//            e.printStackTrace();
            LOGGER.error("出现异常：",e);
        }

    }

}
