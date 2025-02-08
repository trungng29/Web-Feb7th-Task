package com.mycompany.project2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;
import java.math.BigInteger;
/**
 *
 * @author ADMIN
 */
public class Project2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger mul = BigInteger.valueOf(1);
        Set<BigInteger> lis = new TreeSet<>();
        while(sc.hasNext()){
            BigInteger n = sc.nextBigInteger();
            lis.add(n);
        }
        for(BigInteger i:lis){
            sum = sum.add(i);
            mul = mul.multiply(i);        
        }
        System.out.println(sum);
        System.out.print(mul);
    }
}