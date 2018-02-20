package io.hxiao.mocker.cloader;

import java.net.URL;
import java.net.URLClassLoader;

public class ASMLoader extends URLClassLoader {
    public ASMLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public ASMLoader(URL[] urls) {
        super(urls);
    }
}
