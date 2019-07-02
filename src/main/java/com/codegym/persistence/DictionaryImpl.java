package com.codegym.persistence;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class DictionaryImpl implements GeneralPersistence {
    HashMap<String , String> listDictionary = new HashMap<>();

    {
        listDictionary.put("Hello","Xin chào");
        listDictionary.put("Goodbye","Tạm Biệt");
        listDictionary.put("Love you","Yêu mày");
        listDictionary.put("Hate you","Ghét chào");

    }
    @Override
    public String translate(String English) {
        return listDictionary.get(English);
    }
}
