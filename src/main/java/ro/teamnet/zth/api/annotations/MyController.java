package ro.teamnet.zth.api.annotations;
import java.lang.annotation.*;

/**
 * Created by Ovidiu.Busuioc on 7/20/2017.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String urlPath();
}

