package se.bjurr.jmib.anotations;

public enum InvocationStyle {
  /** Create an <code>invoke(instance)</code>. */
  INVOKE_AT_END,
  /** Create an <code>on(instance)</code> and <code>invoke()</code>. */
  INVOKE_WITH_ON,
  /** Create an <code>on(instance)</code> and <code>invoke(instance)</code>. */
  INVOKE_AUTO
}
