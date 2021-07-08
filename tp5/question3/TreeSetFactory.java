package question3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory<T extends Comparable>/* à compléter */implements Factory<Set>/* à compléter */{
public Set create(){
return new TreeSet<Comparable<T>>();
}
}
