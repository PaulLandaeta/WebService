package com.tierconnect.resteasy;

import com.tierconnect.xively.Dashboard;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Paul Landaeta on 9/23/2015.
 */
public class XivelyApp extends Application {
    protected HashSet<Object> singletons = new HashSet<Object>();
    public XivelyApp() {
        singletons.add(new Dashboard());
    }

    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> providers = new LinkedHashSet<Class<?>>();
        return providers;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}

