package ir.ac.iust.scrawl.scrawlib;

import java.util.HashMap;

/**
 * This class is help parsing.
 * Created by bardia on 1/20/16.
 */
public class SymbolTable {
    public enum Type{
        STRING,
        DOCUMENT,
        ELEMENT,
        ELEMENTS,
        INTEGER,
        FLOAT,
        BOOLEAN,
    }

    public class Info {
        private String name;
        private int local;
        private Type type;
        private int block;

        public Info(String name, Type type){
            this.name = name;
            this.type = type;
        }

        public Type getType() {
            return type;
        }

        public int getLocal(){return local;}
    }

    private HashMap<String, Info> id2Info;
    private HashMap<Integer, Info> local2Info;
    private static final int MAX_LOCAL_VAR = 200;
    private int max_local = 0;

    public int put(String id,Type type){
        Info info;
        for(int i=0;i<MAX_LOCAL_VAR;i++) {
            if(max_local < i)
                max_local = i;
            if(!local2Info.containsKey(i)){
                info = new Info(id,type);
                info.local = i;
                local2Info.put(i,info);
                id2Info.put(id,info);
                return i;
            }
        }
        return -1;
    }

    public Info get(String id){
        return id2Info.get(id);
    }

    public void remove(String id){
        if(id2Info.containsKey(id))
            id2Info.remove(id);
    }

    public int getLocalIndex(String id){
        return id2Info.get(id).local;
    }


    public void __debug__printKeys(){
        for(String s: id2Info.keySet())
            System.out.println(s);
    }
}
