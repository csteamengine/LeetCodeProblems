package Medium.RevealCardsInIncreasingOrder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution {


    @Test
    void main() {
        int[] input = {1};
        int[] expected = {1};

        int[] result = deckRevealedIncreasing(input);

        assertArrayEquals(expected, result);
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length == 1){
            return deck;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int[] sorted = mergeSort(deck);
        int index = 0;
        int[] output = new int[sorted.length];

        list.add(0, sorted[index]);
        index++;

        while(index < sorted.length-1){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(list.get(list.size()-1));
            temp.add(sorted[index]);
            temp.addAll(list);
            list = temp;
            list.remove(list.size()-1);
            index++;
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(sorted[index]);
        temp.addAll(list);
        list = temp;

        for(int i =0; i<list.size(); i++){
            output[i] = list.get(i);
        }

        return output;
    }

    public int[] mergeSort(int[] input){
        if(input.length == 1){
            return input;
        }
        int index = input.length / 2;
        int[] output = new int[input.length];
        int[] left = mergeSort(Arrays.copyOfRange(input, 0, index));
        int[] right = mergeSort(Arrays.copyOfRange(input, index, input.length));
        int leftIndex = 0;
        int rightIndex = 0;
        index = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] > right[rightIndex]){
                output[index] = left[leftIndex];
                leftIndex++;
            }else{
                output[index] = right[rightIndex];
                rightIndex++;
            }
            index++;
        }

        while(leftIndex < left.length){
            output[index] = left[leftIndex];
            leftIndex++;
            index++;
        }

        while(rightIndex < right.length){
            output[index] = right[rightIndex];
            rightIndex++;
            index++;
        }
        return output;
    }

}
