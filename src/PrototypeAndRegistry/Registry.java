package PrototypeAndRegistry;

import java.util.HashMap;

public class Registry {
    private HashMap<String,Student> map;
    public Registry()
    {
        map=new HashMap<String,Student>();

    }

    public Student getStudent(Student s) {
        return map.get(s.getBacthName());
    }

    public void setMap(Student obj) {

        map.put(obj.getBacthName(), obj);
    }
}
