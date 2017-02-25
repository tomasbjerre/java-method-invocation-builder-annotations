package se.bjurr.jmib.anotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static se.bjurr.jmib.anotations.InvocationStyle.INVOKE_AUTO;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target({TYPE})
public @interface GenerateMethodInvocationBuilder {
  InvocationStyle style() default INVOKE_AUTO;
}
