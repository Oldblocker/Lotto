/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottoapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Luke
 */
public class Lotto {
    List<Integer> numbers;
    List<Integer> chosen6;
    public Lotto() 
    {
        numbers = new ArrayList<>();
        chosen6 = new ArrayList<>();
    }
    
    public void generate()
    {
        for(int i = 1; i <=49; i++)
        {
            numbers.add(i);
        }
    }
    
    public void randomize()
    {
        Collections.shuffle(numbers);
        
        for(int i = 0; i < 6; i++)
        {
            chosen6.add(numbers.get(i));
            System.out.println(chosen6.get(i));
        }
    }
    
    public int checkResult(List<Integer> userNumbers)
    {
        int freq = 0;
        for(int i = 0; i < 6; i++)
        {
            freq = Collections.frequency(chosen6, userNumbers.get(i));
            if(freq != 0)
            {
                freq += freq;
            }
        }
        return freq;
    }
}
