package daw01.funcionesClas;

import javax.swing.border.StrokeBorder;
import java.util.Locale;

public class Ex_06 {
    public static void main(String[] args) {
        System.out.println(vocal("A"));
    }

    static boolean vocal(String letra) {
        if (letra == letra.toLowerCase(Locale.ROOT)) {
            return false;
        } else
            return true;
    }
}
