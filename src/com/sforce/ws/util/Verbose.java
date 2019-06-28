
package com.sforce.ws.util;

import java.io.PrintStream;
import java.lang.reflect.Array;


/**
 * Util class to log debug messages.
 *
 * @author  http://cheenath.com
 * @version 1.0
 * @since   1.0   Nov 5, 2005
 */
public class Verbose {

  public static final String WSDL = "wsdl";
  public static final String XML = "xml";

  private static final PrintStream out = System.out;

  public static boolean isVerbose(String type) {
    return true;
  }

  public static String toString(Object o) {
    if (o == null) {
      return "null";
    }

    if (o.getClass().isArray()) {
      return toStringArray(o);
    }

    return o.toString();
  }

  private static String toStringArray(Object o) {
    StringBuilder sb = new StringBuilder();
    int length = Array.getLength(o);
    sb.append("{[").append(length).append("]");
    for (int i=0; i<length; i++) {
      sb.append(Array.get(o, i));
      sb.append(",");
    }
    sb.append("}");
    return sb.toString();
  }

  public static void log(Object message) {
    String m = toString(message);

    StackTraceElement[] stack = Thread.currentThread().getStackTrace();
    StackTraceElement element = stack[stack.length-1];
    out.print("[WSC]");
    String className = element.getClassName();
    int index = className.lastIndexOf(".");
    className = className.substring(index+1);
    out.print("[");
    out.print(className);
    out.print(".");
    out.print(element.getMethodName());
    out.print(":");
    out.print(element.getLineNumber());
    out.print("]");
    out.println(m);
  }
}
