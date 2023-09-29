package task6;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class MyClassTest {
        @Test
        public void sumListShouldBeCorrect() {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
            List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
            List<Integer> resultTest = MyClass.sumLists(list1, list2);
            assertEquals(result, resultTest, "Сумма списков не верна!");
        }

        @Test
        public void findMaxShouldBeCorrect(){
            List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
            int expectedMax = 3;
            assertEquals(expectedMax, MyClass.findMax(nums), "Данное число не является наибольшим!");
        }

        @Test
        public void filterStringsShouldBeCorrect(){
            List<String> words = new ArrayList<>(Arrays.asList("sword", "knife", "he"));
            List<String> wordsTest = new ArrayList<>(Arrays.asList("sword", "knife"));
            int minLength = 1;
            assertEquals(wordsTest.size(), MyClass.filterStrings(words, minLength).size(), "Списки должны быть равны!");
        }
    }