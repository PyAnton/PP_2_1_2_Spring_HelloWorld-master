import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
