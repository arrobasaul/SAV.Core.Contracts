/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

/**
 *
 * @author savarela
 */
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public abstract @interface VisualServiceAnnotations {
    String descriptor() default "";
    String imageuri() default "";
    boolean IsDefauldService() default false; 
    boolean ForceSynchronism () default false;
    int Priority () default Integer.MAX_VALUE;
    Type[] contract = null;
}
