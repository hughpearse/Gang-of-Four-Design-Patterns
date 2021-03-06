/*
 * Copyright (c) 2015. Philip A Senger
 */

package com.cngrgroup.gofdp.DesignPatterns.Visitor;

/**
 * Body
 *
 * @author Philip Senger
 * @author <a href="mailto:philip.a.senger@cngrgroup.com">philip.a.senger@cngrgroup.com</a>
 * @version 1.0
 * @date Apr 26, 2006 10:41:52 AM
 * @since SDK1.3
 */
public class Body implements Visitable {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
