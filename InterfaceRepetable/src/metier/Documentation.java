package metier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.METHOD)
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Documentations.class)
public @interface Documentation {
	String auteur();
	String date();
	int version() default 1;
	
	String[] responsables();
}


