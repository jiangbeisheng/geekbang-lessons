/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.geektimes.configuration.demo;

import org.geektimes.projects.user.domain.User;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditorSupport;

/**
 * TODO Comment
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since TODO
 */
public class IntrospectorDemo {

    public static void main(String[] args) throws Exception {
        /*通过Java Beans 自省的方式进行操作*/
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyEditorSupport
        for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
            System.out.println(propertyDescriptor.getReadMethod());
        }
    }
}
