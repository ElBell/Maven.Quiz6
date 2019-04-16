package rocks.zipcode.io.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        return IntStream.rangeClosed(start, end).boxed().toArray(Integer[]::new);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        return org.apache.commons.lang3.ArrayUtils.toPrimitive(array);
//        return Arrays.stream(array).map(Object::toString)
//                .collect(Collectors.joining())
//                .toCharArray();
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        return org.apache.commons.lang3.ArrayUtils.toObject(array);
    }
}
