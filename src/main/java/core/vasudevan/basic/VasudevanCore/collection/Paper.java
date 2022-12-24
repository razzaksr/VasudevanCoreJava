package core.vasudevan.basic.VasudevanCore.collection;

import lombok.Data;

import java.io.Serializable;

@Data
public class Paper implements Comparable<Paper>, Serializable {
    public String name;
    public Integer code;
    public Integer internals;
    public Character grade;

    @Override
    public int compareTo(Paper o) {
        return o.name.compareTo(this.name);
    }
}
