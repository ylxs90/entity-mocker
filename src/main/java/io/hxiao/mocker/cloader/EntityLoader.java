package io.hxiao.mocker.cloader;

import java.net.URL;
import java.net.URLClassLoader;

public class EntityLoader extends URLClassLoader {


    public EntityLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public EntityLoader(URL[] urls) {
        super(urls);
    }


}
