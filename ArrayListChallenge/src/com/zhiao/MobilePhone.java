package com.zhiao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> nameList = new ArrayList<String>();
    private ArrayList<Long> numberList = new ArrayList<Long>();

    public void addName(String name) {
        nameList.add(name);
    }

    public void addNumber(long number) {
        numberList.add(number);
    }

    public void printContact() {
        for (int i=0;i<nameList.size();i++) {
            System.out.println(i + ". " + nameList.get(i) + " " + numberList.get(i));
        }
    }

    public void removeContact(int index) {
        if ((index >= 0) && (index < nameList.size())) {
            nameList.remove(index);
            numberList.remove(index);
        } else {
            System.out.println("Index entered out of bound! The maximum index is " + nameList.size());
        }
    }

    public void removeContact(String name) {
        int index = nameList.indexOf(name);
        if (index >= 0) {
            removeContact(index);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void removeContact(long number) {
        int index = numberList.indexOf(number);
        if (index >= 0) {
            removeContact(index);
        } else {
            System.out.println("The number entered is not in your contact book!");
        }
    }

    public void modifyContact(int index, String newName, long newNumber) {
        if ((index >= 0) && (index < nameList.size())) {
            nameList.set(index,newName);
            numberList.set(index,newNumber);
        } else {
            System.out.println("Index entered out of bound! The maximum index is " + nameList.size());
        }
    }

    public void modifyContact(int index, String newName) {
        if ((index >= 0) && (index < nameList.size())) {
            nameList.set(index,newName);
        } else {
            System.out.println("Index entered out of bound! The maximum index is " + nameList.size());
        }
    }

    public void modifyContact(int index, long newNumber) {
        if ((index >= 0) && (index < nameList.size())) {
            numberList.set(index,newNumber);
        } else {
            System.out.println("Index entered out of bound! The maximum index is " + nameList.size());
        }
    }

    public void modifyContact(String name, String newName, long newNumber) {
        int index = searchContact(name);
        if (index >= 0) {
            modifyContact(index,newName,newNumber);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void modifyContact(String name, String newName) {
        int index = searchContact(name);
        if (index >= 0) {
            modifyContact(index,newName);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void modifyContact(String name, long newNumber) {
        int index = nameList.indexOf(name);
        if (index >= 0) {
            modifyContact(index,newNumber);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void modifyContact(long number, String newName, long newNumber) {
        int index = searchContact(number);
        if (index >= 0) {
            modifyContact(index,newName,newNumber);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void modifyContact(long number, String newName) {
        int index = searchContact(number);
        if (index >= 0) {
            modifyContact(index,newName);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public void modifyContact(long number, long newNumber) {
        int index = nameList.indexOf(number);
        if (index >= 0) {
            modifyContact(index,newNumber);
        } else {
            System.out.println("The name entered is not in your contact book!");
        }
    }

    public int searchContact(String name) {
        int index = nameList.indexOf(name);
        return index;
    }

    public int searchContact(long number) {
        int index = numberList.indexOf(number);
        return index;
    }

}
