package com.qizy.basedata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductData {

    /**
     * 商品类别列表
     */
    public static Map<String, String> typeMap = new HashMap<>();

    /**
     * 商品列表
     */
    public static Map<String, List<String>> productMap = new HashMap<>();

    static {
        // 手机类
        typeMap.put("phone","手机");
        List<String> phoneList = new ArrayList<>();
        phoneList.add("Apple iPhone 12");
        phoneList.add("p50e");
        phoneList.add("xiaoMi 11");
        phoneList.add("moto edge X30");
        productMap.put("phone",phoneList);
        // 女装
        typeMap.put("woman dress","女装");
        List<String> wDressList = new ArrayList<>();
        wDressList.add("bebe2020");
        wDressList.add("vvc2022");
        wDressList.add("Taxiphone");
        productMap.put("woman dress",wDressList);
        // 图书
        typeMap.put("book","图书");
        List<String> bookList = new ArrayList<>();
        bookList.add("tian long ba bu");
        bookList.add("gao kao shu xue");
        bookList.add("prison break");
        bookList.add("harry potter");
        productMap.put("book",bookList);
        // 健身
        typeMap.put("sport","健身");
        List<String> sportList = new ArrayList<>();
        sportList.add("football");
        sportList.add("basketball");
        sportList.add("blanket");
        sportList.add("miking");
        productMap.put("sport",sportList);

        typeMap.put("food","食物");
        List<String> foodList = new ArrayList<>();
        foodList.add("Dorabella");
        foodList.add("Nestle");
        foodList.add("Orion");
        foodList.add("wang lao ji");
        productMap.put("food",foodList);


    }
}
