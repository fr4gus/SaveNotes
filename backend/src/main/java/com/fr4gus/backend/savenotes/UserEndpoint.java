package com.fr4gus.backend.savenotes;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(name = "userEndpoint", version = "v1", namespace = @ApiNamespace(ownerDomain = "savenotes.backend.fr4gus.com", ownerName = "savenotes.backend.fr4gus.com", packagePath=""))
public class UserEndpoint {

    // TODO in memory implementation to test endpoints
    static Map<Long, User> mLocalUsers = new HashMap<Long, User>();
    static long mLastId = 0;

    // Make sure to add this endpoint to your web.xml file if this is a web application.

    private static final Logger LOG = Logger.getLogger(UserEndpoint.class.getName());

    /**
     * This method gets the <code>User</code> object associated with the specified <code>id</code>.
     * @param id The id of the object to be returned.
     * @return The <code>User</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getUser")
    public User getUser(@Named("id") Long id) {

        LOG.info("Calling getUser method");
        User user = mLocalUsers.get(id);

        LOG.info("Returning user with id " + user.getDeviceId());

        return user;
    }

    /**
     * This inserts a new <code>User</code> object.
     * @param user The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertUser")
    public User insertUser(User user) {
        LOG.info("Calling insertUser method");

        synchronized (mLocalUsers) {
            mLastId++;
            user.setId(mLastId);
            mLocalUsers.put(mLastId, user);

        }

        return user;
    }

    @ApiMethod(name = "listUsers", path = "user/list")
    public List<User> listUser(){
        ArrayList<User> users = new ArrayList<User>();
        users.addAll( mLocalUsers.values());
        return users;
    }

}