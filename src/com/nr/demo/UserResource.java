package com.nr.demo;

import com.nr.demo.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nr on 2017/02/12 0012.
 */
@Path("/users")
public class UserResource {
    private static Map<Integer,User> userMap=new HashMap<Integer, User>();
    /**
     * 增加
     * @param user
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> createUser(User user){
        userMap.put(user.getUserId(),user);
        return getAllUsers();
    }
    /**
     * 删除
     * @param id
     */
    @DELETE
    @Path("{id}")
    public List<User> deleteUser(@PathParam("id") int id){
        userMap.remove(id);
        return getAllUsers();
    }
    /**
     * 修改
     * @param user
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public List<User> updateUser(User user){
        userMap.put(user.getUserId(),user);
        return getAllUsers();
    }



    /**
     * 根据id查询
     * @param id
     * @return
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") int id){
        User user=userMap.get(id);
        return user;
    }
    /**
     * 查询所有
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllUsers(){
        List<User> users=new ArrayList<User>();
        users.addAll(userMap.values());
        return users;
    }
}
