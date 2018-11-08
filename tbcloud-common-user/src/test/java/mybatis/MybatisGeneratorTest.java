package mybatis;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * @author dzh
 * @date 2018-11-08 18:05
 */
public class MybatisGeneratorTest {


    static Logger LOG = LoggerFactory.getLogger(MybatisGeneratorTest.class);

    @Test
    public void genMapper() {
        try (InputStream is = MybatisGeneratorTest.class.getResourceAsStream("/mybatis/mysql2mapper.xml")) {
            ConfigurationParser cp = new ConfigurationParser(null);
            Configuration config = cp.parseConfiguration(is);

            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, null);
            myBatisGenerator.generate(null);
            LOG.info("succ");
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
    }

}