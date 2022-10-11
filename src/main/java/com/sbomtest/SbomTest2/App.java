package com.sbomtest.SbomTest2;

import java.io.File;
import java.util.List;

import org.jboss.resteasy.core.config.DefaultConfigurationFactory;

import com.google.common.base.Converter;
import com.google.common.base.Enums;
import com.xxl.job.core.enums.RegistryConfig;
import io.atomix.core.AtomixConfig;
import scala.Int$;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int TimeOut = RegistryConfig.DEAD_TIMEOUT;
    	DefaultConfigurationFactory DefConfigFactory = new DefaultConfigurationFactory();
    	String Sbom = new String(DefConfigFactory.toString());
        System.out.println( "Hello World!" );
    }
    
    public static AtomixConfig config(Object classLoader, List<File> files) {
    	 return config(Thread.currentThread().getContextClassLoader(), files);
    }
    
    public static <T extends Enum<T>> Converter<String,T> parse(Class<T> clazz) {
        return Enums.stringConverter(clazz);
     }
}
