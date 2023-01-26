import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;


public class TestUser {

//    @Test
//    public void createNewUserTest(){
//        System.out.println("Creating new user");
//    }
//
//    @Test(dependsOnMethods = "createNewUserTest")  //depends on first test, if first test is failed then second test will not execute
//    public void checkCreatedUser(){
//        System.out.println("Checking created user");
//    }
//
//    @Test
//    public void test1(){
//        String str = "Hello";
//        assertEquals(1,1);
//    }
//
//    public static int[] sort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int temp = 0;
//                if (array[i] > array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//     return array;
//    }
//
//    @Test
//    public void test5(){
//
//        int[] arr = {1,4,-7,8};
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] > arr[i+1]){
//                Assert.fail();
//            }else{
//                Assert.assertTrue(true);
//            }
//        }
//        System.out.println(Arrays.toString(sortArray(arr)));
//    }


//
//    public static int[] sortArray(int[] arr){
//        int indexMin;
//        for (int i = 0; i < arr.length-1; i++) {
//            indexMin = i;
//            for (int j = i; j <arr.length ; j++) {
//                if (arr[indexMin] > arr[j]){
//                    indexMin = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[indexMin];
//            arr[indexMin] = temp;
//        }
//        return arr;
//    }

    public int sum(int a, int b){
        return a/b;
    }

    @Test
    public void testSum2() {

        Assert.assertEquals(sum(4,4), 1);
    }


}
