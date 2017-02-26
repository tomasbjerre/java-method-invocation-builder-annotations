package se.bjurr.jmib.anotations;

public enum BuilderStyle {
  /** Create an <code>invoke(instance)</code>. */
  SUPPLY_INSTANCE_AS_INVOKE_PARAMETER,
  /** Create an <code>on(instance)</code> and <code>invoke()</code>. */
  SUPPLY_INSTANCE_WITH_ON_METHOD,
  /** Create an <code>on(instance)</code> and <code>invoke(instance)</code>. */
  DEFAULT
}
