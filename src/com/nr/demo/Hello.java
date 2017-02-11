package com.nr.demo;

import com.nr.demo.bean.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by nr on 2017/02/10 0010.
 */
@Path("/webapi/myresource")
public class Hello {
    // This method is called if TEXT_PLAIN is request

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello(){
        return "Hello Jersey";
    }

    // This method is called if XML is request
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello(){
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }
    // This method is called if HTML is request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }

    /**
     * 方法处理 HTTP GET 请求。返回的对象以"application/json"媒体类型
     * 给客户端
     * @return User 以 application/json 形式响应
     */
    @GET
    @Path("/userJson")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJson(){
        User user=new User();
        user.setName("niurui");
        user.setAge(23);
        return user;
    }

    /**
     * 方法处理 HTTP GET 请求。返回的对象以"application/xml"媒体类型
     * 给客户端
     * @return User 以 application/xml 形式响应
     */
    @GET
    @Path("/userXml")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXml(){
        User user=new User();
        user.setName("niurui");
        user.setAge(23);
        return user;
    }
}
