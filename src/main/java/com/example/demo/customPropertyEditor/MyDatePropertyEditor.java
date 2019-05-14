package com.example.demo.customPropertyEditor;

import org.springframework.transaction.annotation.Transactional;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDatePropertyEditor extends PropertyEditorSupport {

    private String format="yyyy-MM-dd";

    public String getFormat() {
        return format;
    }

    public MyDatePropertyEditor setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("text:   "+text);
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        try{
            Date d=sdf.parse(text);
            this.setValue(d);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
