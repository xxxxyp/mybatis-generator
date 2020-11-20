package com.myfun.repository.support;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.INSTALL)
public class Main extends AbstractMojo {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    @Parameter
    private String configurationFile;

    @Override
    public void execute() {
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        try {
            Configuration config = cp.parseConfiguration(new File(configurationFile));
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            logger.info("==================处理成功！==================");
        } catch (Exception e) {
            logger.error("generate fail !", e);
        }
    }

    public static void main(String[] args) throws MojoFailureException, MojoExecutionException {
        Main main = new Main();
        main.configurationFile = "src/main/resources/generatorErpConfig.xml";
        main.execute();

    }
}
