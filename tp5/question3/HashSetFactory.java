package question3;

import java.util.Set;
import java.util.HashSet;

public class HashSetFactory<T>/* à compléter */implements Factory<Set>/* à compléter */{
public Set create(){
    return new HashSet();}
}