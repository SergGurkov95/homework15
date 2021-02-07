//слайд 40

package homework15;

import java.util.ArrayList;
import java.util.List;

public class Quiz {


    public static void main(String[] args) {
        System.out.println(wildcardsTest(new ArrayList<>()));
    }


    public static int wildcardsTest(List<? super Integer> numbers) {
        numbers.add(10);                        //У List<? super Integer> get возвращает Object.
        return (Integer) numbers.get(0);                  // Необходимо либо numbers.get() явно привести к int/Integer,
    }                                           //либо вовзращаемый тип метода wildcardsTest изменить на Object,
}                                               //либо отказаться от wildcard



