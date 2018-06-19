package com.example.myapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Widget {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JsonIgnore
    private Lesson lesson;


    private String name;
    private String text;

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    private String dtype;
    private String className;
    private String style;
    private String width;
    private String height;
    private String href;
    private String src;
    private String widgetName;
    private enum ListTypeenum{Ordered,Unordered};
    @Enumerated(EnumType.STRING)
    private ListTypeenum ListType;
    private String[] listItems;
    private Integer size,order1;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    public String getWidgetName() {
        return widgetName;
    }

    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName;
    }

    public ListTypeenum getListType() {
        return ListType;
    }

    public void setListType(ListTypeenum listType) {
        ListType = listType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }


    public String[] getListItems() {
        return listItems;
    }

    public void setListItems(String[] listItems) {
        this.listItems = listItems;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getOrder1() {
        return order1;
    }

    public void setOrder1(Integer order1) {
        this.order1 = order1;
    }
}
