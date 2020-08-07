package be.intecbrussel.Easy;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {
    public List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
