package com.sbomtest.SbomTest2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jboss.resteasy.core.config.DefaultConfigurationFactory;
import org.nd4j.linalg.dataset.api.iterator.DataSetIterator;

import com.google.common.base.Converter;
import com.google.common.base.Enums;
import com.xxl.job.core.enums.RegistryConfig;
import io.atomix.core.AtomixConfig;
import scala.Int$;
import org.apache.catalina.filters.RemoteIpFilter;
import org.deeplearning4j.core.datasets.test.TestDataSetIterator;
import org.deeplearning4j.datasets.iterator.impl.MnistDataSetIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	int TimeOut = RegistryConfig.DEAD_TIMEOUT;
    	DefaultConfigurationFactory DefConfigFactory = new DefaultConfigurationFactory();
    	String Sbom = new String(DefConfigFactory.toString());
    	RemoteIpFilter filter = new RemoteIpFilter();
    	
    	int batchSize = 0;
		int rngSeed = 0;
		DataSetIterator mnistTest = new MnistDataSetIterator(batchSize, false, rngSeed);
		TestDataSetIterator testDatasetIterator = new TestDataSetIterator(mnistTest);
    	
        System.out.println( "Hello World!" );
    }
    
    public static AtomixConfig config(Object classLoader, List<File> files) {
    	 return config(Thread.currentThread().getContextClassLoader(), files);
    }
    
    public static <T extends Enum<T>> Converter<String,T> parse(Class<T> clazz) {
        return Enums.stringConverter(clazz);
     }
}
