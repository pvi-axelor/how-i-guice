package learn.guc.service;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

//used @Qualifier instead of @BindingAnnotation
@Qualifier
@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER })
public @interface RickRoll {

}