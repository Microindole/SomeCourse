package learn.ex2025.ex5;

import java.util.ArrayList;

public class BrowserHistory extends ArrayList<String> {

    public void visit(String url){
        this.add(url);
    }

    public String back(){
        if(this.isEmpty()){
            return null;
        }
        return remove(this.size() - 1);
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public int getSize(){
        return this.size();
    }

}
