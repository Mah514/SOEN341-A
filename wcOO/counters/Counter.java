package wcOO.counters;

import wcOO.fileManager.IFileManager;
import wcOO.options.IOption;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

//Counter abstract class implementing ICounter interface
abstract class Counter implements ICounter {
    static Integer count = 0;
    boolean isWord = false;
    IOption opt;
    ArrayList<IFileManager> files;

    abstract public void count(ArrayList<String> line) throws IOException, URISyntaxException;

    public void resetCount(){count = 0;}
    public Integer getCount() {
        return count;
    }
    public boolean isSpace(Integer C) {
        return (C == ' ' || C == '\t');
    }
    public void setOpt(IOption opt){this.opt = opt;}
    public void setFiles(ArrayList<IFileManager> files){this.files = files;}
}
