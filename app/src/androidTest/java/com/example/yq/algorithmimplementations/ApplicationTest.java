package com.example.yq.algorithmimplementations;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.example.yq.algorithmimplementations.data_structure.Tree;

import java.util.LinkedList;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    LinkedList<Integer> list = new LinkedList<Integer>();
    //CRUD

    Tree tree = new Tree();
    //CRUD


}