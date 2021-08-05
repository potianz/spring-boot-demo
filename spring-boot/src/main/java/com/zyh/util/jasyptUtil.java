package com.zyh.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class jasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("admin");
        System.out.println(name+"--------------"+password);
//        /k0Ohi+ulwBZFSQnNnHjjg==--------------Y4FzSgKBF/0EnVVYr7deXg==
//        g3AgQzCpIFqfyQB11kmTzw==--------------drrLPjXHes5We1JUiuyIrQ==

    }
}
