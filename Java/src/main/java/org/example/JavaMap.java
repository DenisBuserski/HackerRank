package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        /* Read input and save as entries in a HashMap */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        while (n-- > 0) {
            String name = br.readLine();
            int phone   = Integer.valueOf(br.readLine());
            map.put(name, phone);
        }

        /* Read each query and check if it's in our HashMap */
        String s;
        while((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        br.close();
    }
}
