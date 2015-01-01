import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



 
  
public class Log4jDemo {   
    static Logger log = Logger.getLogger(Log4jDemo.class);
    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();//默认配置   
        //PropertyConfigurator.configure("c:/log4j.properties");   
        //动态配置,参数可以是一个properties文件所在路径的String对象   
        //可以是一个properties文件所在路径的URL对象，也可以是一个properties对象   
           
        //DOMConfigurator.configure("c:/log4j.xml");//XML配置文件   
  
        //PropertyConfigurator.configure()的参数还可以是XML、Properties对象   
        FileAppender appender = null;
       // SimpleLayout layout = new SimpleLayout();
        HTMLLayout  layout = new HTMLLayout();
        //把输出端配置到out.txt
        appender = new FileAppender(layout,"d:/out.html",false);
         log.addAppender(appender);//添加输出端
         log.setLevel(Level.WARN);//覆盖配置文件中的级别
        //下面就可使用log4j   
        log.info("info");   
        log.debug("debug");   
        log.error("error");   
        log.warn("warn");   
    }
} 

