package se.bjurr.jmib.anotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static se.bjurr.jmib.anotations.BuilderStyle.DEFAULT;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target({TYPE})
public @interface GenerateMethodInvocationBuilder {
  BuilderStyle style() default DEFAULT;
}
