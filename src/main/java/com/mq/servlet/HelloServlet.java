package com.mq.servlet;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // 获取全局参数
        ServletContext context = getServletContext();
        System.out.println(context.getInitParameter("paramTest"));

//        //普通方式读取工程文件
//        //1.创建属性对象
//        Properties properties = new Properties();
//        //2.导入配置文件输入流
//        InputStream is = HelloServlet.class.getClassLoader().getResourceAsStream("config.properties");
//        properties.load(is);
//
//        //3.获取属性的值
//        String name = properties.getProperty("name");
//        System.out.println(name);


        //获取指定文件在服务器上的绝对路径
        String path = context.getRealPath("config.properties");
        System.out.println(path);





    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
